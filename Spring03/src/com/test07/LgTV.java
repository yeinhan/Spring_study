package com.test07;

public class LgTV implements TV {

	
	
	public LgTV() {
		System.out.println("lg tv 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("lg tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("lg tv power off");
	}

	@Override
	public void volUp() {
		System.out.println("lg tv vol up");
	}

	@Override
	public void volDown() {
		System.out.println("lg tv vol down");
	}

}
