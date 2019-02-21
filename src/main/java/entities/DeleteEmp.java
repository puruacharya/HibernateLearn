package entities;

import org.hibernate.Session;

import org.hibernate.Transaction;


public class DeleteEmp {

	public static void main(String[] args) {
		
		Session session = Data.getSf().openSession();
		Transaction tr = session.beginTransaction();
		Emp emp = session.get(Emp.class, 114);
		session.delete(emp);
		tr.commit();
		session.close();

	}
}
