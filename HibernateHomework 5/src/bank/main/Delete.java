package bank.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bank.entity.Bank;

public class Delete {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 2;

		Bank p = ss.get(Bank.class, id);

		ss.remove(p);
		System.out.println("data is Deleted.....");

		tr.commit();
		ss.close();
	}

}
