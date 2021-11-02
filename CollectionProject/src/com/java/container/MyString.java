package com.java.container;

public class MyString{
	
	private String x;
	private String y;
	
	public MyString(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}

public void swap() {
	System.out.println(" Swapping...");
	String temp=x;
	x=y;
	y=temp;
	
}
public void print() {
	System.out.println("x" +x);
	System.out.println("y" +y);
	
	}
}




