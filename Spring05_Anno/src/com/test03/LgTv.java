package com.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LgTv implements Tv{
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("lg tv power on");
	}

	@Override
	public void powerDown() {
		// TODO Auto-generated method stub
		System.out.println("lg tv power off");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("lg tv volUp");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("lg tv voldown");
	}
	

}
