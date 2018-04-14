package com.atuldwivedi.learn.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atuldwivedi.learn.spring.domain.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Long saveStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		return (Long) session.save(student);
	}

}
