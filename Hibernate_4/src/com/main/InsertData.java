package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bank;

public class InsertData {

	public static void main(String[] args) {
	
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
	
		Bank s=new Bank();
		
		s.setCname("kkkk");
		s.setCbranch("hhhh");
		
		ss.persist(s);
		System.out.println("Data inserted.........");
		tr.commit();
		ss.close();
		
		

	}

}
