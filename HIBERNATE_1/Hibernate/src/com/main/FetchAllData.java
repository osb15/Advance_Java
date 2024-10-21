package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;
import com.mysql.cj.AbstractQuery;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration ();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		
		CriteriaQuery<Car> cq=cb.createQuery(Car.class);
		
		Root<Car>root=((jakarta.persistence.criteria.AbstractQuery<Car>)cq).from(Car.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Car>list=query.getResultList();
		
		for (Car car : list) {
			
			System.out.println(car);
			
		}
		
		
		
	}
}
