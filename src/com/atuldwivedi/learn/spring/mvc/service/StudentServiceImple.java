package com.atuldwivedi.learn.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atuldwivedi.learn.spring.domain.Student;
import com.atuldwivedi.learn.spring.mvc.dao.StudentDao;

@Service
public class StudentServiceImple implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Long saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}

}
