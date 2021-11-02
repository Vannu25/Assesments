package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Typo")
@Scope("prototype")
public class BikeType {

	public BikeType() {
		
		System.out.println("BikeType()");
	}

public void getBikeType() {
	System.out.println("Which Type of Bike..");
}
}

