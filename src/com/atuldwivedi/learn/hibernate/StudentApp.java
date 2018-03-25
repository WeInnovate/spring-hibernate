package com.atuldwivedi.learn.hibernate;

import java.util.List;

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
//			Student std = new Student(10002l, "Rishabh", true);
//			session.save(std);
			
//			Student std = session.get(Student.class, 10002l);
//			System.out.println(std);
			
			
			List<Student> students = session.createQuery("from Student").getResultList();
			System.out.println(students);
			
//			List<Student> studentsWithName = session.createQuery("from Student s where s.name = 'Sachin'").getResultList();
//			System.out.println(studentsWithName);
			
//			Student std = session.get(Student.class, 10002l);
//			std.setGraduate(false);
			
//			int noOfRecordsAffectedInDb = session.createQuery("update Student set name = 'Sach' where rollNo = 10001").executeUpdate();
//			System.out.println(noOfRecordsAffectedInDb);
			
			// commit/close
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
