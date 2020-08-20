package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		
		Emp e = factory.getBean("lee", Emp.class);
		Emp h = factory.getBean("hong", Emp.class);
		System.out.println(e);
		System.out.println(h);
	}
}
