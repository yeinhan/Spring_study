package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/application.xml");
		
		MyClass myclass = (MyClass)factory.getBean("myClass");
		myclass.prn();
		
//		Score sc = (Score)factory.getBean("score");
		
		BeanTst bean = factory.getBean("beanTst", BeanTst.class );
	}

}
