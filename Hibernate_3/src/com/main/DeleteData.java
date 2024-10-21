package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Which you Can Delete:");
		int Sid=sc.nextInt();
		int SID=(Sid);
		
		Student c= ss.get(Student.class,Sid);
		
		
		ss.remove(c);
		
		System.out.println("Data is Deleted.............");
		
		tr.commit();
		ss.close();

	}

}
