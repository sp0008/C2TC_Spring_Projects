package com.cg.student;

public class Student {
	private String name;
	private int id;
	
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
	
	public void display() {
		System.out.println("Student name is "+name);
		System.out.println("Student Id is "+id);
	}

}
