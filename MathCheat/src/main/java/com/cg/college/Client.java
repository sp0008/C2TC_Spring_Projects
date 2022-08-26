package com.cg.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*
		 * Students s1=new Students(); s1.cheating();
		 */
		
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Students stu=a.getBean("s3",Students.class);
		stu.cheating();
		
		AnotherStudent stu1=a.getBean("s4",AnotherStudent.class);
		stu.cheating();
	}
}
