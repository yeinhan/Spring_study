package com.test05;

import org.springframework.stereotype.Component;

@Component
public class Man implements Person{

	@Override
	public void classWork() {
		System.out.println("컴퓨터를 키고 이클립스를 실행한다.");
	}
	
}
