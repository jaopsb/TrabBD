package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EscolasDAO {
	private SessionFactory factory;

	public EscolasDAO() {
		factory = new Configuration().configure().buildSessionFactory();
	}

	public void insert(Escolas escola,String pk) {

		try {

			Session session = factory.openSession();
			Transaction tx = (Transaction) session.beginTransaction();

			session.save(escola);
			session.flush();
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean existeEscola(String pk) {
		Session session = factory.openSession(); 
		Escolas escola = (Escolas)session.load(Escolas.class, Integer.parseInt(pk)); 
		return escola != null;
	}

	public Escolas retrieve(String pk) throws Exception{ 
		Session session = factory.openSession(); 
		Escolas escola = (Escolas)session.load(Escolas.class, pk); 
		session.flush(); 
		session.close(); 
		return escola; 
	} 
}
