package com.test05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test05.Person;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test05/applicationContext.xml");
		
		Person m = factory.getBean("man", Person.class);
		Person w = factory.getBean("woman", Person.class);

		System.out.println("여학생 입장");
		w.classWork();
		System.out.println("----------------");
		System.out.println("남학색 입장");
		m.classWork();
	}
}
