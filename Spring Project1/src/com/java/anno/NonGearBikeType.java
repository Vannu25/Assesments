package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("nongear")
@Scope("prototype")
public class NonGearBikeType extends BikeType{
	
public NonGearBikeType() {
		
		System.out.println("NonGearBike()");
	}

public void getBikeType() {
	System.out.println("NonGear..");
}


}
	


