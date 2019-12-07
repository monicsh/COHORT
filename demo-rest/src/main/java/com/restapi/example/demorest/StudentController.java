package com.restapi.example.demorest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentinfo")
public class StudentController {
	
	@Autowired
	private StudentService studentservice;

	@GetMapping
	public List<Student> getStudentInfo(){
	
		return studentservice.getStudents();
	}
	
	
	@PostMapping
	public Student addStudent(@RequestBody Student student){
		
		return studentservice.addStudent(student);
	}
}

