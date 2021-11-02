package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> myNumberSet = new TreeSet<Integer>();
		System.out.println(" Container is ready....");
		
		myNumberSet.add(10);
		System.out.println(" Adding first Element...");
		myNumberSet.add(15);
		System.out.println(" Adding Second Element...");
		myNumberSet.add(8);
		System.out.println(" Adding Third Element...");
		myNumberSet.add(20);
		System.out.println(" Adding fourth Element...");
		
		System.out.println(" Contents are added to the container.....");
		Iterator<Integer> numberIterator = myNumberSet.iterator();
		while(numberIterator.hasNext())
		{
			int num= numberIterator.next();
			System.out.println("num is"+num);
		}
		
	}	
	

}

