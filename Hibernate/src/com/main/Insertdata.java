package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class Insertdata {

	public static void main(String[] args) {
		
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Car e=new Car();
		e.setCName("Tata Nano");
		e.setCmodel("TATA");
		
		
		ss.persist(e);
		System.out.println("Data inserted.........");
		tr.commit();
		ss.close();
		
		
	}

}
