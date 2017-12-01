package cliente;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import dao.Aluno;
import dao.AlunoSimples;
import dao.Escolas;
import dao.Prova;
import dao.Redacao;

public class Main {

	private Aluno aluno;
	private Escolas escola;
	private Prova prova;
	private Redacao redacao;
	private Collection<Aluno> listaAlunos;
	private Collection<Escolas> listaEscolas;
	private Collection<Prova> listaProvas;
	private Collection<Redacao> listaRedacao;

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	private static Scanner input;

	public static void main(String[] args) {
		input  = new Scanner(System.in);
		boolean sair = false;

		Connection conexao = initConn();

		factory = new Configuration().configure().buildSessionFactory();

		session = factory.openSession();
		do {
			System.out.println("Bem vindo ao Trabalho de BD!!");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
					+ "|  1-Consultar todos Alunos (ALUNOS_SIMPLES)                |\n"
					+ "|  2-Consultar um nº determinado de alunos (ALUNOS_SIMPLES) |\n"
					+ "|  3-Pesquisar um aluno por numero de inscrição             |\n"
					+ "|  4-Apagar um aluno                                        |\n"
					+ "|  5-Ver estatisticas                                       |\n"
					+ "|  6-Sair                                                   |\n"
					+ "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
					);

			System.out.println("DIGITE A OPCAO DESEJADA:");
			sair = menu(input.nextInt());
		}while(!sair);
		closeConn(conexao);
		System.exit(0);
	}


	private static boolean menu(int opt) {
		boolean retorno = false;
		switch(opt) {
		case 1://selecionar aluno simples
			get_AS(1);
			break;
		case 2:
			get_AS(2);
			break;
		case 3:
			getAluno();
			break;
		case 4:
			delAluno();
			break;
		case 5:
			getEstatisticas();
			break;
		case 6:
			retorno = true;
			break;
		}

		return retorno;
	}
	
	private static boolean hasRegiao(String regiao,String[] lista) {
		boolean retorno = false;
		for(String aux : lista) {
			if(aux.equals(regiao)) {
				retorno = true;
			}
		}
		return retorno;
	}

	private static void getEstatisticas() {
		String sql_estatisticas_completa = "SELECT COUNT(*)/(SELECT COUNT(*) FROM ALUNOS) * 100,uf_res FROM ALUNOS group by uf_res";
		String sql_estatisticas_por_uf = "SELECT COUNT(*)/(SELECT COUNT(*) FROM ALUNOS) * 100,uf_res FROM ALUNOS where uf_res = ";
		String sql_estatisticas_por_regiao = "SELECT COUNT(*)/(SELECT COUNT(*) FROM ALUNOS) * 100 FROM ALUNOS WHERE uf_res in ";

		String norte = "(\"AC\",\"AM\",\"RR\",\"RO\",\"AP\",\"PA\",\"TO\")";
		String nordeste = "(\"MA\",\"PI\",\"BA\",\"CE\",\"RN\",\"PB\",\"PE\",\"AL\",\"SE\")";
		String centro_oeste = "(\"MT\",\"GO\",\"DF\",\"MS\")";
		String sudeste = "(\"SP\",\"RJ\",\"MG\",\"ES\")";
		String sul = "(\"PR\",\"RS\",\"SC\")";

		String[] regioes = {"AC","AL","AM","AP","BA","CE","DF","ES","GO","MA","MG","MS","MT","PA","PB","PE","PI","PR","RJ","RN","RO","RR","RS","SC","SE","SP","TO"};

		int opt = 0;
		Query query;
		List<Object[]> listaObj;

		input.nextLine();//limpa buffer

		do {

			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("| 1-Ver estatisticas de alunos completa (todos os estados)|");
			System.out.println("| 2-ver estatistica de alunos por estado                  |");
			System.out.println("| 3-ver estatisticas por regiões                          |");
			System.out.println("| 5-voltar ao menu inicial                                |");
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

			opt = input.nextInt();

			switch(opt) {
			case 1:
				query = session.createNativeQuery(sql_estatisticas_completa);

				listaObj = query.getResultList();


				for(Object[] obj : listaObj) {
					System.out.println(obj[0] + "% dos alunos do banco são do estado de " + obj[1]);

				}

				break;

			case 2:
				input.nextLine();//limpa buffer
				
				System.out.println("Digite o estado:");
				String estado = input.nextLine();

				estado = estado.toUpperCase();

				if(hasRegiao(estado,regioes)) {

					query = session.createNativeQuery(sql_estatisticas_por_uf + "\"" + estado + "\"");

					listaObj = query.getResultList();

					if(listaObj != null && !listaObj.isEmpty()) {
						Object[] aux = listaObj.get(0);

						System.out.println(aux[0] + "% dos alunos do banco sao do estado " + aux[1] );
					}
					
				}else {
					System.out.println("Estado inválido!");
				}
				
				break;
			case 3:
				input.nextLine();//limpa buffer

				System.out.println("Ver todas as regioes ou procurar uma regiao especifica?\n1-Todas\n2-Escolher Região");
				int tipoPesquisa = input.nextInt();

				switch(tipoPesquisa) {
				case 1:
					BigDecimal[] listaRegioes = new BigDecimal[5];

					query = session.createNativeQuery(sql_estatisticas_por_regiao + norte);
					listaRegioes[0] = (BigDecimal) query.uniqueResult();

					query = session.createNativeQuery(sql_estatisticas_por_regiao + nordeste);
					listaRegioes[1] = (BigDecimal) query.uniqueResult();

					query = session.createNativeQuery(sql_estatisticas_por_regiao + centro_oeste);
					listaRegioes[2] = (BigDecimal) query.uniqueResult();

					query = session.createNativeQuery(sql_estatisticas_por_regiao + sudeste);
					listaRegioes[3] = (BigDecimal) query.uniqueResult();

					query = session.createNativeQuery(sql_estatisticas_por_regiao + sul);
					listaRegioes[4] = (BigDecimal) query.uniqueResult();


					System.out.println();
					System.out.println(listaRegioes[0].toString() + "% dos registros do banco são da regiao Norte");
					System.out.println(listaRegioes[1].toString() + "% dos registros do banco são da regiao Nordeste");
					System.out.println(listaRegioes[2].toString() + "% dos registros do banco são da regiao Centro-Oeste");
					System.out.println(listaRegioes[3].toString() + "% dos registros do banco são da regiao Sudeste");
					System.out.println(listaRegioes[4].toString() + "% dos registros do banco são da regiao Sul");
					System.out.println();

					break;

				case 2:
					input.nextLine();//limpa buffer
					int regiao;

					do {
						System.out.println("+++++++++++++++++++++++++++++++++++++");
						System.out.println("| 1-Norte                           |");
						System.out.println("| 2-Nordeste                        |");
						System.out.println("| 3-Centro-Oeste                    |");
						System.out.println("| 4-Sudeste                         |");
						System.out.println("| 5-Sul                             |");
						System.out.println("| 6-Voltar                          |");
						System.out.println("+++++++++++++++++++++++++++++++++++++");

						regiao = input.nextInt();
						BigDecimal pcrRegiao;

						switch(regiao) {
						case 1:
							query = session.createNativeQuery(sql_estatisticas_por_regiao + norte);
							pcrRegiao = (BigDecimal) query.uniqueResult();

							System.out.println(pcrRegiao.toString() + "% dos registros do banco são da regiao Norte");
							break;
						case 2:
							query = session.createNativeQuery(sql_estatisticas_por_regiao + nordeste);
							pcrRegiao = (BigDecimal) query.uniqueResult();

							System.out.println(pcrRegiao.toString() + "% dos registros do banco são da regiao Nordeste");

							break;
						case 3:
							query = session.createNativeQuery(sql_estatisticas_por_regiao + centro_oeste);
							pcrRegiao = (BigDecimal) query.uniqueResult();

							System.out.println(pcrRegiao.toString() + "% dos registros do banco são da regiao Centro-Oeste");

							break;
						case 4:
							query = session.createNativeQuery(sql_estatisticas_por_regiao + sudeste);
							pcrRegiao = (BigDecimal) query.uniqueResult();

							System.out.println(pcrRegiao.toString() + "% dos registros do banco são da regiao Sudeste");

							break;
						case 5:
							query = session.createNativeQuery(sql_estatisticas_por_regiao + sul);
							pcrRegiao = (BigDecimal) query.uniqueResult();

							System.out.println(pcrRegiao.toString() + "% dos registros do banco são da regiao Sul");

							break;
						}
					}while(regiao != 6);
					break;
				}

				break;
			}
		}while(opt != 5);
	}

	private static void delAluno() {
		input.nextLine();//limpa buffer
		System.out.println("Digite o numero da inscricao do aluno que será apagado:");
		String nu_insc = input.nextLine();

		if(isAluno(nu_insc)) {
			System.out.println("Tem certeza que deseja apagar o Aluno de inscricao: "+ nu_insc + "?\n sua Prova e Redacao tambem serão apagadas." );
			String resposta = input.nextLine();

			while(resposta.equals("yes") && resposta.equals("sim") && resposta.equals("no") && resposta.equals("nao")
					&& resposta.equals("y") && resposta.equals("s") && resposta.equals("n")) {
				System.out.println("Não entendi sua resposta,deseja ver todos os resultados?");
				resposta = input.nextLine();
			}

			if(resposta.equals("yes") || resposta.equals("sim") || resposta.equals("y") || resposta.equals("s")  ) {

				Query query = session.createQuery("delete from Aluno where id_nu_insc = \'" + nu_insc +"\'");

				System.out.println("Aluno apagado!!");
			}
		}else {
			System.out.println("Não existe nenhum aluno com esse numero de inscricao ou o numero esta errado,tente novamente.");
		}

	}

	@SuppressWarnings("deprecation")
	private static boolean isAluno(String nu_insc) {

		Criteria crit = session.createCriteria(Aluno.class);
		crit.add(Restrictions.eq("id_nu_insc",nu_insc));
		List results = crit.list();  

		return results.get(0) != null;
	}

	private static void get_AS(int opt){

		Query query;
		String sql = "Select * from ALUNOS_SIMPLES";
		switch(opt) {
		case 1:
			BigInteger cont = (BigInteger) session.createNativeQuery("SELECT Count(*) FROM ALUNOS_SIMPLES ").uniqueResult();

			input.nextLine();//limpar buffer

			if(cont.compareTo(BigInteger.valueOf(500)) >= 0) {
				System.out.println("Foram encontrados " + cont + " resultados, deseja ver todos?");
			}
			String resposta = input.nextLine();

			while(resposta.equals("yes") && resposta.equals("sim") && resposta.equals("no") && resposta.equals("nao")
					&& resposta.equals("y") && resposta.equals("s") && resposta.equals("n")) {
				System.out.println("Não entendi sua resposta,deseja ver todos os resultados?");
				resposta = input.nextLine();
			}

			if(resposta.equals("yes") || resposta.equals("sim") || resposta.equals("y") || resposta.equals("s")  ) {

				query = session.createNativeQuery(sql).addEntity(AlunoSimples.class);
				Collection<AlunoSimples> colAS = query.getResultList();

				for(AlunoSimples aux: colAS) {

					System.out.println("Matricula: "
							+ aux.getId_nu_insc() 
							+ " sexo: " + aux.getId_sexo() 
							+ " uf_res: " + aux.getUf_res() 
							+ " uf_prova: " + aux.getUf_prova()
							+ " nota_cn: " + aux.getNota_cn()
							+ " nota_ch: " + aux.getNota_ch() 
							+ " nota_lc: " + aux.getNota_lc() 
							+ " nota_mt: " + aux.getNota_mt()
							+ " nota_redacao: "+ aux.getNu_nota_redacao());

				}
			}
			break;
		case 2:
			input.nextLine();//limpar buffer

			System.out.println("Digite a quantidade de alunos que deseja acessar:");
			int resp = input.nextInt();

			sql += " limit " + resp;//inserindo o limite

			query = session.createNativeQuery(sql).addEntity(AlunoSimples.class);
			Collection<AlunoSimples> colAS = query.getResultList();

			for(AlunoSimples aux: colAS) {

				System.out.println("Matricula: "
						+ aux.getId_nu_insc() 
						+ " sexo: " + aux.getId_sexo() 
						+ " uf_res: " + aux.getUf_res() 
						+ " uf_prova: " + aux.getUf_prova()
						+ " nota_cn: " + aux.getNota_cn()
						+ " nota_ch: " + aux.getNota_ch() 
						+ " nota_lc: " + aux.getNota_lc() 
						+ " nota_mt: " + aux.getNota_mt()
						+ " nota_redacao: "+ aux.getNu_nota_redacao());

			}
			break;
		}
		input.nextLine();
		input.nextLine();
	}

	@SuppressWarnings("deprecation")
	public static void getAluno() {
		input.nextLine();

		try {


			System.out.println("Digite o numero de inscricao do estudante:");
			String resposta = input.nextLine();

			//session.createCriteria(persistentClass)("select * from ALUNOS where id_nu_insc = \'" + resposta + "\'").list();

			Criteria crit = session.createCriteria(Aluno.class);
			crit.add(Restrictions.eq("id_nu_insc",resposta));
			List results = crit.list();  

			Aluno aluno = (Aluno) results.get(0);

			System.out.println(aluno.toString());
			input.nextLine();
		}catch(Exception e) {
			System.out.println("Não foi encontrado o aluno, verifique o número informado");
		}

	}

	public static boolean isInteger(String s) {
		return isInteger(s,10);
	}

	public static boolean isInteger(String s, int radix) {
		if(s.isEmpty()) return false;
		for(int i = 0; i < s.length(); i++) {
			if(i == 0 && s.charAt(i) == '-') {
				if(s.length() == 1) return false;
				else continue;
			}
			if(Character.digit(s.charAt(i),radix) < 0) return false;
		}
		return true;
	}

	public final static void clearConsole()
	{
		try
		{
			final String os = System.getProperty("os.name");

			if (os.contains("Windows"))
			{
				Runtime.getRuntime().exec("cls");
			}
			else
			{
				Runtime.getRuntime().exec("clear");
			}
		}
		catch (final Exception e)
		{
			//  Handle any exceptions.
		}
	}

	private static Connection initConn() {
		Connection conexao = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bd_enem?" + "user=root");
			System.out.println("Conectado!");

		} catch (SQLException e) {
			System.out.println("Erro de banco de Dados:" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Erro: driver nao encontrado." + e.getMessage());
		}

		return conexao;
	}

	private static void closeConn(Connection conexao) {
		try {
			if(conexao != null) {
				conexao.close();
				System.out.println("Desconectado!");
			}
		}catch(SQLException e) {
			System.out.println("Erro na hora de fechar a conexao:" 
					+ e.getMessage());
		}
	}
}
