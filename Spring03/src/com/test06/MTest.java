package com.test06;

public class MTest {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean("samsung");
		tv.powerOn();
		tv.volUp();
		tv.volDown();
		tv.powerOff();
	}
}
