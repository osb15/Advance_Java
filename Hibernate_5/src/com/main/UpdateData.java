package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bike;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The ID Which you Can Update:");
		int Id=sc.nextInt();
		int id=(Id);
		
		Bike c= ss.get(Bike.class,Id);
		
	
		
		System.out.println("Enter Bike Name :");
		String Name =sc.next();
		
		System.out.println("Enter The Bike Model Name:");
		int Model=sc.nextInt();
		
		
		c.setName(Name);
		c.setModel(Model);
		ss.merge(c);
		
//		ss.update(s);
		
		System.out.println("Data Is Updated................");
		
		tr.commit();
		ss.close();

	}

}
