package com.java.container;

public class MyFloat{
	
	private float p;
	private float q;
	
	public MyFloat (float p, float q) {
		super();
		this.p = p;
		this.q = q;
	}

public void swap() {
	System.out.println(" Swapping...");
	float temp1=p;
	p=q;
	q= temp1;
	
}
public void print() {
	System.out.println("p" +p);
	System.out.println("q" +q);
	
	}

	}


