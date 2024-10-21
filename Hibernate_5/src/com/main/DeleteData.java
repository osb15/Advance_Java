package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bike;

public class DeleteData {
		

		public static void main(String[] args) {
			Configuration cfg =new Configuration ();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Bike.class);
			
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tr=ss.beginTransaction();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The ID Which you Can Delete:");
			int id=sc.nextInt();
			int ID=(id);
			
			Bike c= ss.get(Bike.class,id);
			
			
			ss.remove(c);
			
			System.out.println("Data is Deleted.............");
			
			tr.commit();
			ss.close();


	}

}
