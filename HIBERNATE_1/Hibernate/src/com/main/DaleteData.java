package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class DaleteData {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		int CID=1;
		Car c=ss.get(Car.class,CID);
		
		ss.remove(c);
		
		System.out.println("Data is Deleted.............");
		
		tr.commit();
		ss.close();
		

	}

}
