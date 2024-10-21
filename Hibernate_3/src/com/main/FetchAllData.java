package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Student;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		
		CriteriaQuery<Student> cq=cb.createQuery(Student.class);
		
		Root<Student>root=((jakarta.persistence.criteria.AbstractQuery<Student>)cq).from(Student.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Student>list=query.getResultList();
		
		for (Student Student : list) 
		{
			
			System.out.println(Student);
			
		}
		

	}

}
