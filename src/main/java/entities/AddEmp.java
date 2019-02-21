package entities;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddEmp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Emp emp = new Emp(114,"DDD","Worker",20000);
		session.save(emp);
		tr.commit();
		session.close();
		

	}

}
