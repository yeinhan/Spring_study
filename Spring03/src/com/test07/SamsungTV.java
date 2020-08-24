package com.test07;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		System.out.println("samsung TV 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("samsung tv power on");
	}
	@Override
	public void powerOff() {
		System.out.println("samsung tv power off");
	}
	@Override
	public void volUp() {
		System.out.println("samsung tv vol up");
	}
	@Override
	public void volDown() {
		System.out.println("samsung tv vol down");
	}

}
