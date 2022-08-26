package com.cg.human;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
public static void main(String[] args) {
	ApplicationContext a=new ClassPathXmlApplicationContext("Beans.xml");
	Human h1=a.getBean("human", Human.class);
	h1.startPumping();	
}
}
