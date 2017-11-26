package cliente;

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
					+ "|  5-ver estatisticas                                       |\n"
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

	private static void getEstatisticas() {
		
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
		clearConsole();

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
							+ " us_res: " + aux.getUf_res() 
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
						+ " us_res: " + aux.getUf_res() 
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

		System.out.println("Digite o numero de inscricao do estudante:");
		String resposta = input.nextLine();

		//session.createCriteria(persistentClass)("select * from ALUNOS where id_nu_insc = \'" + resposta + "\'").list();

		Criteria crit = session.createCriteria(Aluno.class);
		crit.add(Restrictions.eq("id_nu_insc",resposta));
		List results = crit.list();  

		Aluno aluno = (Aluno) results.get(0);

		System.out.println(aluno.toString());
		input.nextLine();

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
