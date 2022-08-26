package com.cg.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		Airtel b=a.getBean("airtel", Airtel.class);
		Jio c=a.getBean("jio", Jio.class);
		b.calling();
		b.data();
		c.calling();
		c.data();
		
		/*
		 * Airtel b=(Airtel)a.getBean("airtel"); b.calling(); b.data();
		 * 
		 * Jio c=a.getBean("jio", Jio.class); c.calling(); c.data();
		 */
		
		//Sim s=a.getBean("sim",Sim.class);
		//s.calling();
		//s.data();
		
		
	}

}
