package com.java.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mydaughter")

public class Daughter extends Mother {
	
	public Daughter() {
		System.out.println("Daughter()");
	}
public void Daughter() {
	System.out.println("Daughter is studying");
}
}
