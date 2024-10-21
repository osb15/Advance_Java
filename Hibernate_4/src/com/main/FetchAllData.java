package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Bank;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bank.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		
		CriteriaQuery<Bank> cq=cb.createQuery(Bank.class);
		
		Root<Bank>root=((jakarta.persistence.criteria.AbstractQuery<Bank>)cq).from(Bank.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Bank>list=query.getResultList();
		
		for (Bank Bank : list) 
		{
			
			System.out.println(Bank);
			
		}
		

	}

}
