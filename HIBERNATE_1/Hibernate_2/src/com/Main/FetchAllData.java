package com.Main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Employee;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FetchAllData {

	public static void main(String[] args) {


		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		CriteriaBuilder cb=ss.getCriteriaBuilder();
		
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		
		Root<Employee>root=((jakarta.persistence.criteria.AbstractQuery<Employee>)cq).from(Employee.class);
		cq.select(root);
		Query query = ss.createQuery(cq);
		
		List<Employee>list=query.getResultList();
		
		for (Employee Employee : list) 
		{
			
			System.out.println(Employee);
			
		}
		

	}

}
