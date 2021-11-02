package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("gear")
@Scope("prototype")
public class GearBikeType extends BikeType{

public GearBikeType() {
		
		System.out.println("GearBike()");
	}

public void getBikeType() {
	System.out.println("Gear..");
}


}
