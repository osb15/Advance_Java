package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bike;

public class InsertData {

	public static void main(String[] args) {
	
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
	
		Bike s=new Bike();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bke Name:");
		String Name=sc.next();
		System.out.println("Enter Bike Model Year:");
		int Model=sc.nextInt();
		
		
		
		s.setName(Name);
		s.setModel(Model);
		
		ss.persist(s);
		System.out.println("Data inserted.........");
		tr.commit();
		ss.close();
		
		

	}

}
