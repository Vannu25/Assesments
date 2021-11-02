package com.java.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mygrandmother")


public class GrandMother {

		
	public GrandMother() {
		
		System.out.println("GrandMother()");
	}

	public void startGrandMother() {
		// TODO Auto-generated method stub
		System.out.println("GrandMother reading book()");
	}

	
}
