package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class Main_Class {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Department.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		
		
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("Surbhi....");
		ss.persist(e1);
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("Lokesh");
		ss.persist(e2);

		Department d = new Department();
		d.setDID(101);
		d.setDNAME("Java Devoloper");
	    e1.setDepartment(d);
	    e2.setDepartment(d);
	    
	    List<Employee> list = new ArrayList<Employee>();
	    list.add(e1);
	    list.add(e2);
	    
	    d.setEmp(list);
	    ss.persist(d);
	    
	    
	    System.out.println("The Mapping  Data Sucessfully............");
	    tr.commit();
	    ss.close();
	    
	    
	}

}
