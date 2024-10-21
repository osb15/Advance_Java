package com.Main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
	
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		String ENAME=sc.next();
		System.out.println("Enter Age:");
		int EAGE=sc.nextInt();
		
		Employee e =new Employee();
		e.setENAME(ENAME);
		e.setEAGE(EAGE);
		
		ss.persist(e);
		System.out.println("Data inserted.........");
		tr.commit();
		ss.close();
		
		

	}

}
