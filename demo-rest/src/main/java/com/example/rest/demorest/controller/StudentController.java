package com.example.rest.demorest.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.demorest.model.Student;
import com.example.rest.demorest.repository.StudentService;

@RestController

//@RequestMapping("/studentinfo")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	@GetMapping("/studentinfo")
	public List<Student> getStudentInfo(){
	
		return studentservice.getStudents();
	}
	
	@GetMapping("/studentinfo/{fname}")
	public Student addStudent(@PathVariable String fname){
		
		return studentservice.getStudentByName(fname);
	}
	
	@PostMapping("/studentinfo")
	public Student addStudent(@RequestBody Student student){
		
		return studentservice.addStudent(student);
	}
}
