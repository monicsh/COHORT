package com.restapi.example.demorest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	

	
	private List<Student> studentList = new ArrayList<>();
	
	public Student addStudent(Student student) {
		studentList.add(student);
		return student;
	}
	
	public List<Student> getStudents(){
		return studentList;
		
	}
	

}
