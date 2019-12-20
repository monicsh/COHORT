package com.example.rest.demorest.model;

public class Course {
	int id = 1;
	String courseName;
	
	
	public Course(String courseName) {
		super();
		this.courseName = courseName;
		this.id++;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
