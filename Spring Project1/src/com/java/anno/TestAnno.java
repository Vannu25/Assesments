package com.java.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
	public static void main(String[] args) {
		
		System.out.println("Container is loading...");
		
		ApplicationContext container = new ClassPathXmlApplicationContext("SpringAnnoConfig2.xml");
      
        System.out.println("-----------");
		
        System.out.println("Container is loaded");
        
        /*GrandMother gm = container.getBean("mygrandmother", GrandMother.class);
         gm.startGrandMother();*/
         

         Bike bik = container.getBean("myBike", Bike.class);
          bik.startBike();
	}
}
