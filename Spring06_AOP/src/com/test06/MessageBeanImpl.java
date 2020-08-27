package com.test06;

public class MessageBeanImpl implements MessageeBean {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello, "+name);
	}

}
