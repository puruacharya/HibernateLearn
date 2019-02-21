package entities;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ViewAll {

	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria cr=session.createCriteria(Emp.class);
		List<Emp> emp=cr.list();
		for(Emp em:emp){
			System.out.println(em);
		} 
		session.close();
		
	}

}
