package bank.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bank.entity.Bank;

public class Insert {

		public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Bank.class);

			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();

			Bank b = new Bank();
               
			b.setCustomer_name("om");
		    b.setCity("harigad");
            b.setSalary(373744); 
		    
			ss.persist(b);

			System.out.println("data inserted....");
			tr.commit();
			ss.close();

		}

		
	}
	
	

