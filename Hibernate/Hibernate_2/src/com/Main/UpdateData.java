package com.Main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Which you Can Update:");
		int Cid=sc.nextInt();
		int CID=(Cid);
		
		Employee c= ss.get(Employee.class,CID);
		
	
		
		System.out.println("Enter Name :");
		String ENAME=sc.next();
		
		System.out.println("Enter Age :");
		int EAGE=sc.nextInt();
		
		
		c.setENAME(ENAME);
		c.setEAGE(EAGE);
		ss.merge(c);
		
//		ss.update(s);
		
		System.out.println("Data Is Updated................");
		
		tr.commit();
		ss.close();
		
		
		

	}

}