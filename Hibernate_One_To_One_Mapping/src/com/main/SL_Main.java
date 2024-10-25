package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.entity.Laptop;
import com.entity.Student;

public class SL_Main {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss =  sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l =new Laptop();
		l.setLID(151);
		l.setName("DELL");
		
		ss.persist(l);
		
		Student s = new Student();
		s.setSID(19);
		s.setName("Omkar B");
		
		s.setLaptop(l);
		
		ss.persist(s);

		
    	System.out.println("Entity Mapping Sucessfully.................");
		
		tr.commit();
		ss.close();
	}

}
