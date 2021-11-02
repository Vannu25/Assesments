package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mymother")

public class Mother extends GrandMother {
	
	public Mother() {
					
		System.out.println("Mother()");
	}

public void Mother() {
	System.out.println("Mother is cooking..");
}
}