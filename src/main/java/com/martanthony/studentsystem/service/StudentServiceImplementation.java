package com.martanthony.studentsystem.service;

import java.util.HashMap;
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
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getStudents(String name) {
		// TODO Auto-generated method stub
		return name == null ? studentRepository.findAll() : studentRepository.findByName(name);
	}

	@Override
	public Student getOne(int id) {
		// TODO Auto-generated method stub
		return studentRepository.getById(id);
	}

	@Override
	public HashMap<String, Boolean> deleteOne(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		HashMap<String, Boolean> res = new HashMap<>();
		res.put("success", true);
		return res;
	}

	@Override
	public Student updateOne(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
}
