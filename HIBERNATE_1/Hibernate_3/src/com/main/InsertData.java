package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class InsertData {

	public static void main(String[] args) {
	
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
	
		Student s=new Student();
		
		s.setSNAME("kkkk");
		s.setSCITY("hhhh");
		
		ss.persist(s);
		System.out.println("Data inserted.........");
		tr.commit();
		ss.close();
		
		

	}

}
