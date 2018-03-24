package com.atuldwivedi.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();

			// open/begin the trx
			session.beginTransaction();

			// perform the trx
			Student std = new Student(10002l, "Rishabh", true);
			session.save(std);

			// commit/close
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
