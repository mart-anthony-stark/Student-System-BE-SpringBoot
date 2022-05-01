package com.martanthony.studentsystem.service;

import java.util.HashMap;
import java.util.List;

import com.martanthony.studentsystem.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getStudents(String name);
	public Student getOne(int id);
	public HashMap<String, Boolean> deleteOne(int id);
	public Student updateOne(Student student);
}
