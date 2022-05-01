package com.martanthony.studentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.martanthony.studentsystem.model.Student;
import com.martanthony.studentsystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("")
	public List<Student> get(@RequestParam(required=false) String name){
		return studentService.getStudents(name);
	}
	
	@PostMapping("/add")
	public Student add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student;
	}
}
