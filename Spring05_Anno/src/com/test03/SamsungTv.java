package com.test03;

import org.springframework.stereotype.Component;

@Component("samsung")
public class SamsungTv implements Tv{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv power on");
	}

	@Override
	public void powerDown() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv powerDown");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv volup");
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		System.out.println("samsung tv voldown");
	}

}
