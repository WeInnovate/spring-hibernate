package com.atuldwivedi.learn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeAutoApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(EmployeeAuto.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
			EmployeeAuto emp = new EmployeeAuto("Atul", "atul.wnw@gmail.com", 99, 100.98);
			Long id = (Long)session.save(emp);
			System.out.println(id);
			
			session.getTransaction().commit();
			
			

		} finally {
			sessionFactory.close();
		}
	}

}
