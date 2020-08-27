package com.test06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test06/applicationContext.xml");
		
		MessageeBean bean = factory.getBean("proxy", MessageeBean.class);
		bean.sayHello();
		
	}
}
