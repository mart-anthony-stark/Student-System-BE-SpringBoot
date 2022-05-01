package com.martanthony.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martanthony.studentsystem.model.Student;
import com.martanthony.studentsystem.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
}
