package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		int CID=2;
		
		Car c= ss.get(Car.class,CID);
		
		c.setCName("Farari");
		c.setCmodel("FAAAA");
		
		ss.merge(c);
		
//		ss.update(s);
		
		System.out.println("Data Is Updated................");
		
		tr.commit();
		ss.close();
		
		
		

	}

}
