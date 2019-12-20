package com.example.rest.demorest.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.example.rest.demorest.model.Student;


@Component
public class StudentService {
	private List<Student> studentList = new ArrayList<>();
	
	// Add a student
	public Student addStudent(Student student) {
			studentList.add(student);
			return student;
		}
	
	
	// Get all students
	public List<Student> getStudents(){
			return studentList;
		}
	
	// Get a student information given by his/her first name
	public Student getStudentByName(String name) {
		for(int i=0; i<studentList.size(); i++) {
			if(studentList.get(i).getFname().compareTo(name) == 0)
			{
				return studentList.get(i);
			}
			
		}
		return null;
	}
}
