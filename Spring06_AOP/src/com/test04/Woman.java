package com.test04;

public class Woman implements Person {

	@Override
	public String classWork() {
		String s = null;

		
		System.out.println("컴퓨터를 켜서 책을 본다.");
		
		return "스프링";
	}
}
