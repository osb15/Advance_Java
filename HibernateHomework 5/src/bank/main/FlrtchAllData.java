package bank.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bank.entity.Bank;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class FlrtchAllData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Bank.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		CriteriaBuilder cb = ss.getCriteriaBuilder();
		CriteriaQuery<Bank> cq = cb.createQuery(Bank.class);
		Root<Bank> root = cq.from(Bank.class);
		cq.select(root);
		Query query = ss.createQuery(cq);

		List list = query.getResultList();

		for (Object object : list) {
			System.out.println(object);
		}
	}
}
