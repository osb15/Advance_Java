package hospital.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hospital.entity.Patient;

public class Update {

	public static void main(String[] args) {
	
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Patient.class);
	
	  SessionFactory sf=cfg.buildSessionFactory();
	  Session ss=sf.openSession();
	  Transaction tr=ss.beginTransaction();
	  
	  int patient_id=1;
	  
	  Patient p=ss.get(Patient.class, patient_id);
	  
	  p.setName("varad");
	  p.setCity("jamnagar");
	  p.setAge(21);
	  p.setDeassice("gover");
	  ss.merge(p);
	  tr.commit();
	  
	  System.out.println("data updated");
	  
	  ss.close();
		
	}
	
}
