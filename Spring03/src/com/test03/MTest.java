package com.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test03.Emp;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test03/applicationContext.xml");
		
		Emp h = factory.getBean("hong", Emp.class);
		Emp e = factory.getBean("lee", Emp.class);
		System.out.println(e);
		System.out.println(h);
		
		
	}
}
