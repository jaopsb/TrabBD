package core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mysql.jdbc.PreparedStatement;
import com.opencsv.CSVReader;

import dao.Aluno;
import dao.Escolas;
import dao.Prova;
import dao.Redacao;

public class Main{

	private static SessionFactory factory;
	private static Session session;
	private static Transaction tx;
	private static ArrayList<String> escolas_chaves;
	private static ArrayList<String> alunos_chaves;


	public static void main(String[] args){
		Connection conexao = initConn();
		escolas_chaves = new ArrayList<>();
		alunos_chaves = new ArrayList<>();

		factory = new Configuration().configure().buildSessionFactory();

		session = factory.openSession();

		LoadCSVReader(conexao);

		closeConn(conexao);
	}

	/*metodo que le o arquivo csv e insere na tabela*/
	private static void LoadCSVReader(Connection conexao) {

		Collection<Aluno> colAluno = new ArrayList<>();
		Collection<Escolas> colEscola = new ArrayList<>();
		Collection<Prova> colProva = new ArrayList<>();
		Collection<Redacao> colRedacao = new ArrayList<>();
		try {
			tx = (Transaction) session.beginTransaction();

			CSVReader csvReader = new CSVReader(new FileReader("/home/jaopsb/Downloads/microdados_enem2014/DADOS/MICRODADOS_ENEM_2014.csv"));

			Aluno aluno;
			Escolas escola;
			Prova prova;
			Redacao redacao;

			String[] rowData;
			String[] header = csvReader.readNext();

			//apenas captura o header
			/*
			for(String a: header) {
				System.out.println(a);
			}*/
			for(int i = 0; i < 10000;i++) {
				rowData = csvReader.readNext();

				for(int j = 0; j < rowData.length; j++) {
					if(rowData[j].isEmpty()) {
						rowData[j] = "-1";
					}
					//System.out.println(rowData[j]);
				}


				//verifica se a chave (nu_insc) ja existe na lista de chaves
				if(checaListaAlunos(rowData[0])) {
					aluno = new Aluno(rowData);
					colAluno.add(aluno);

					prova = new Prova(rowData);
					colProva.add(prova);	

					redacao = new Redacao(rowData);
					colRedacao.add(redacao);
				}

				//verifica se a chave (cod_esc) ja existe na lista de chaves
				if(checaListaEscola(rowData[7])) {
					escola = new Escolas(rowData);					
					colEscola.add(escola);
				}

			}

			int count = 0;

			//add primeiro as escolas por causa da chave id_cod_esc nos alunos
			//for para servico batch de envio da colecao de escolas
			for(Escolas aux: colEscola) {
				session.saveOrUpdate(aux);
				if ( ++count % 20 == 0 ) {
					session.flush();
					session.clear();
				}
			}

			//for para servico batch de envio da colecao de alunos
			for(Aluno aux: colAluno) {
				session.saveOrUpdate(aux);
				if ( ++count % 20 == 0 ) {
					session.flush();
					session.clear();
				}
			}

			for(Prova aux: colProva) {
				session.saveOrUpdate(aux);
				if ( ++count % 20 == 0 ) {
					session.flush();
					session.clear();
				}
			}
			
			for(Redacao aux: colRedacao) {
				session.saveOrUpdate(aux);
				if ( ++count % 20 == 0 ) {
					session.flush();
					session.clear();
				}
			}

			count = 0;

			tx.commit();
			session.close();
			csvReader.close();
			System.out.println("FIM");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

	private static boolean checaListaEscola(String chave) {
		if(!escolas_chaves.contains(chave)) {
			escolas_chaves.add(chave);
			return true;
		}else {
			return false;
		}

	}

	private static boolean checaListaAlunos(String chave) {
		if(!escolas_chaves.contains(chave)) {
			escolas_chaves.add(chave);
			return true;
		}else {
			return false;
		}

	}

	//metodo nao esta sendo usado mais
	//metodo que insere os alunos usando jdbc
	private static void insereAluno(String[] dados, Connection conexao) {
		PreparedStatement stmt;


		for(int i = 0; i < dados.length;i++) {
			if(dados[i].isEmpty()) {
				dados[i] = "0";
			}
		}

		for(String a: dados) {
			System.out.println(a);
		}

		try {
			stmt = (PreparedStatement) conexao.prepareStatement("");

			stmt.setString(1,dados[0]);
			stmt.setInt(2,Integer.parseInt(dados[1]));
			stmt.setInt(3,Integer.parseInt(dados[2]));
			stmt.setString(4, dados[3]);
			stmt.setString(5,dados[4]);
			stmt.setString(6,dados[5]);
			stmt.setInt(7,Integer.parseInt(dados[6]));
			stmt.setInt(8,Integer.parseInt(dados[7]));
			stmt.setInt(9,Integer.parseInt(dados[15]));
			stmt.setString(10,dados[16]);
			stmt.setInt(11,Integer.parseInt(dados[17]));
			stmt.setInt(12,Integer.parseInt(dados[18]));
			stmt.setString(13,dados[19]);
			stmt.setString(14, dados[20]);
			stmt.setString(15,dados[21]);
			stmt.setInt(16,Integer.parseInt(dados[22]));
			stmt.setInt(17, Integer.parseInt(dados[23]));
			stmt.setInt(18, Integer.parseInt(dados[24]));
			stmt.setInt(19, Integer.parseInt(dados[25]));
			stmt.setInt(20, Integer.parseInt(dados[26]));

			stmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//metodo nao esta sendo usado
	private static void insereEscola(String[] dados, Connection conexao) {
		PreparedStatement stmt;

		if(!dados[7].isEmpty()) {

			try {
				Statement stm = conexao.createStatement();
				String sql = "SELECT * FROM ESCOLAS WHERE cod_esc = " + dados[7];
				ResultSet rs = stm.executeQuery(sql);

				if(!rs.next()){

					stmt = (PreparedStatement) conexao.prepareStatement("");

					stmt.setInt(1,Integer.parseInt(dados[7]));
					stmt.setInt(2,Integer.parseInt(dados[8]));
					stmt.setString(3,dados[9]);
					stmt.setString(4, dados[10]);
					stmt.setString(5,dados[11]);
					stmt.setInt(6,Integer.parseInt(dados[12]));
					stmt.setInt(7,Integer.parseInt(dados[13]));
					stmt.setInt(8,Integer.parseInt(dados[14]));

					stmt.execute();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
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