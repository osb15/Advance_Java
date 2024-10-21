package hospital.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hospital.entity.Patient;

public class Insert {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Patient.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Patient p = new Patient();

		p.setPatient_id(4);
		p.setName("kunal");
		p.setCity("jalgao");
		p.setAge(21);
		p.setDeassice("jd");

		ss.persist(p);

		System.out.println("data inserted....");
		tr.commit();
		ss.close();

	}

}
