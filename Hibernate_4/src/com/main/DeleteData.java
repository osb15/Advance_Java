package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Bank;

public class DeleteData {
		

		public static void main(String[] args) {
			Configuration cfg =new Configuration ();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Bank.class);
			
			SessionFactory sf=cfg.buildSessionFactory();
			Session ss=sf.openSession();
			Transaction tr=ss.beginTransaction();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter The Which you Can Delete:");
			int Cid=sc.nextInt();
			int CID=(Cid);
			
			Bank c= ss.get(Bank.class,Cid);
			
			
			ss.remove(c);
			
			System.out.println("Data is Deleted.............");
			
			tr.commit();
			ss.close();


	}

}
