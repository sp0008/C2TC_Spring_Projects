package com.cg.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
		Student s=a.getBean("s1",Student.class);
		Student s3=a.getBean("s2",Student.class);
		s.display();
		s3.display();
	}
}
