package com.martanthony.studentsystem.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@ResponseBody
	public List<Student> get(@RequestParam(required=false) String name){
		return studentService.getStudents(name);
	}
	
	@PostMapping("")
	@ResponseBody
	public Student add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public HashMap<String, Boolean> delete(@PathVariable int id) {
		return studentService.deleteOne(id);
	}
	
	@PutMapping("")
	@ResponseBody
	public Student update(@RequestBody Student student) {
		studentService.updateOne(student);
		return student;
	}
}
