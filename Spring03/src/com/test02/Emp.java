package com.test02;

public class Emp {
	private String name;
	private int num;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", num=" + num + "]";
	}
	
	
}
