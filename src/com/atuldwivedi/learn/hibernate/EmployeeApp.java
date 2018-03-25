package com.atuldwivedi.learn.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeApp {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		try {
			Session session = sessionFactory.getCurrentSession();
			
			session.beginTransaction();
			
//			Employee emp = new Employee(null, "Atul", "atul.wnw@gmail.com", 99, 100.98);
			Employee emp = new Employee("Atul", "atul.wnw@gmail.com", 99, 100.98);
			Long id = (Long)session.save(emp);
			System.out.println(id);
			
			session.getTransaction().commit();
			
			

		} finally {
			sessionFactory.close();
		}
	}

}
