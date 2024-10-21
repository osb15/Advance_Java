package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Bike;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Bike.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		
		CriteriaQuery<Bike> cq=cb.createQuery(Bike.class);
		
		Root<Bike>root=((jakarta.persistence.criteria.AbstractQuery<Bike>)cq).from(Bike.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Bike>list=query.getResultList();
		
		for (Bike Bike : list) 
		{
			
			System.out.println(Bike);
			
		}
		

	}

}
