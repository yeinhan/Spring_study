package com.test02;

public class MessageBeanKo implements MessageBean{
	@Override
	public void sayHello(String name) {
		System.out.println("안녕, "+name);
	}
}
