package entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowSingleEmp {

	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Emp emp = session.get(Emp.class, 112);
		
		System.out.println(emp);
		session.close();

	}

}
