package in.ineuron.main;


import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.Account;
import in.ineuron.model.Employee;
import in.ineuron.util.HibernateUtil;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		
		try {
			session =HibernateUtil.getSession();
	
				transaction= session.beginTransaction();
				
				Account account  = new Account();
				account.setAccName("vishnu");
				account.setAccNo("1234");
				account.setAccType("savings");
				
				Employee employee = new Employee();
				employee.setEaddress("hyderabad");
				employee.setAccount(account);
				employee.setEsal(25000.0f);
				employee.setEname("vishnu");
				
				session.save(employee);
				
				flag = true;
					
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			if(flag) {
				transaction.commit();
				System.out.println("Object saved...");
			}else {
				transaction.rollback();
				System.out.println("Object not saved...");
			}
				
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}

}
