package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test04.Emp;

public class MTest {
	public static void main(String[] args) {
ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/applicationContext.xml");
		
		Developer lee = factory.getBean("leess", Developer.class);
		Engineer hong = factory.getBean("hongg", Engineer.class);
		System.out.println(lee);
		System.out.println(hong);
	}
}
