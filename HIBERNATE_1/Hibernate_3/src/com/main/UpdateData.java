package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Which you Can Update:");
		int Cid=sc.nextInt();
		int CID=(Cid);
		
		Student c= ss.get(Student.class,CID);
		
	
		
		System.out.println("Enter Name :");
		String SNAME=sc.next();
		
		System.out.println("Enter City :");
		String SCITY=sc.next();
		
		
		c.setSNAME(SNAME);
		c.setSCITY(SCITY);
		ss.merge(c);
		
//		ss.update(s);
		
		System.out.println("Data Is Updated................");
		
		tr.commit();
		ss.close();
		
		
		

	}

}