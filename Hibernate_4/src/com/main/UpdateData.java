package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bank;

public class UpdateData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Which you Can Update:");
		int cid=sc.nextInt();
		int Cid=(cid);
		
		Bank c= ss.get(Bank.class,cid);
		
	
		
		System.out.println("Enter Name :");
		String Cname=sc.next();
		
		System.out.println("Enter Branch :");
		String Cbranch=sc.next();
		
		
		
		c.setCname(Cname);
		c.setCbranch(Cbranch);
		ss.merge(c);
		
//		ss.update(s);
		
		System.out.println("Data Is Updated................");
		
		tr.commit();
		ss.close();

	}

}
