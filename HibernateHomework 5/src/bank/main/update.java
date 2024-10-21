package bank.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bank.entity.Bank;



public class update {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);
		
		  SessionFactory sf=cfg.buildSessionFactory();
		  Session ss=sf.openSession();
		  Transaction tr=ss.beginTransaction();
		  
		  int id=1;
		  
		  Bank c=ss.get(Bank.class, id);
		
		  c.setCustomer_name("kiran");	
	      c.setCity("dubai");
		  c.setSalary(78908);
		  ss.merge(c);
		  tr.commit();
		  
		  System.out.println("data updated");
		  
		  ss.close();
			
		}
		

}
