package com.example.rest.demorest.model;

/*
{
"fname" : "monika",
"lname" : "sharma",
"score" : 69
}
*/

public class Student {
	String fname;
	String lname;
	int score;
	//String city;

	

	public Student(String fname, String lname, int score) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.score = score;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}

	
	

}
