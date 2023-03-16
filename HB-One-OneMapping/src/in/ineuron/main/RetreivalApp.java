package in.ineuron.main;


import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Account;
import in.ineuron.model.Employee;
import in.ineuron.util.HibernateUtil;

public class RetreivalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Employee employee = null;
		
		
		try {
			session =HibernateUtil.getSession();
	        employee = session.get(Employee.class, 1);
	        System.out.println(employee);
				
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			
				
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
