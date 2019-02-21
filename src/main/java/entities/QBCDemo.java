package entities;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class QBCDemo {

	public static void main(String[] args) {
		Configuration conf = new Configuration().configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		
		Criteria criteria = session.createCriteria(Emp.class);
		
//		Order order1 = Order.desc("salary");
//		criteria.addOrder(order1);
//		Order order2 = Order.asc("ename");
//		criteria.addOrder(order2);
//		
		
		Criterion crto1= Restrictions.eq("desg","manager");
		criteria.add(crto1);
		Criterion crto2 = Restrictions.gt("salary", 40000);
		criteria.add(crto2);
		Criterion crto3 = Restrictions.and(crto1,crto2);
		
		
		
		criteria.add(crto1);criteria.add(crto2);criteria.add(crto3);
		List <Emp> list= criteria.list();
		
		for(Emp emp : list){
			System.out.println(emp);
		}
		session.close();
	}

}
