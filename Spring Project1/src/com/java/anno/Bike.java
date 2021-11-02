package com.java.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myBike")
@Scope("prototype")

public class Bike {
    
	@Autowired
	@Qualifier("gear")
	BikeType BikeType1;
	
	@Autowired
	@Qualifier("nongear")
	BikeType BikeType2;
	
	
	public Bike() {
			super();
			
			System.out.println(" bike.......()");
			System.out.println("-------");
		}

		public void startBike() {
			// TODO Auto-generated method stub
			
			System.out.println("Starting the Bike ......");
			BikeType1.getBikeType();
			BikeType2.getBikeType();
			
		}

		
	}



