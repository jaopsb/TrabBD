package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class alunoDAO {

	private SessionFactory factory;

	public alunoDAO() {
		factory = new Configuration().configure().buildSessionFactory();
	}

	public void insert(Aluno aluno,String pk) {

		try {
			Session session = factory.openSession();
			Transaction tx = (Transaction) session.beginTransaction();

			session.save(aluno);
			session.flush();
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

	private boolean existeAluno(String pk) {
		Aluno aluno = null;
		Session session = factory.openSession(); 
		//Aluno aluno = (Aluno)session.load(Aluno.class,pk); 

		aluno = (Aluno) session.find(Aluno.class,Integer.parseUnsignedInt(pk));

		return aluno != null;
	}


	public Aluno retrieve(String pk) throws Exception{ 
		Session session = factory.openSession(); 
		Aluno aluno = (Aluno)session.load(Aluno.class, pk); 
		session.flush(); 
		session.close(); 
		return aluno; 
	} 

}
