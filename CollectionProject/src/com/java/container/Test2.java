package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;

public class Test2 {

	public static void main(String[] args) {
		
	ChemicalElement chemicalElement1 = new ChemicalElement(10, "Neon", "Ne", 20.179);
	ChemicalElement chemicalElement2 = new ChemicalElement(15, "Phosphorus", "P", 30.974);	
	ChemicalElement chemicalElement3 = new ChemicalElement(8, "Oxygen", "O", 16);	
	ChemicalElement chemicalElement4 = new ChemicalElement(20, "calcium", "Ca", 40);	
	ChemicalElement chemicalElement5 = new ChemicalElement(5, "Boron", "B", 10.811);	
	ChemicalElement chemicalElement6 = new ChemicalElement(9, "Fluorine", "F", 18.99);	
	ChemicalElement chemicalElement7 = new ChemicalElement(13, "Aluminium", "Al", 26.98);
	
	TreeSet<ChemicalElement> periodicTable = new TreeSet<ChemicalElement>();
	System.out.println("container is ready...");
	
	System.out.println("chemicalElement1..");
	periodicTable.add(chemicalElement1);
	
	System.out.println("chemicalElement2..");
	periodicTable.add(chemicalElement2);
	
	System.out.println("chemicalElement3..");
	periodicTable.add(chemicalElement3);
	
	System.out.println("chemicalElement4..");
	periodicTable.add(chemicalElement4);
	
	System.out.println("chemicalElement5..");
	periodicTable.add(chemicalElement5);
	
	System.out.println("chemicalElement6..");
	periodicTable.add(chemicalElement6);
	
	System.out.println("chemicalElement7..");
	periodicTable.add(chemicalElement7);
	
	Iterator<ChemicalElement> periodictableList = periodicTable.iterator();
	while(periodictableList.hasNext());
	{
		System.out.println("Number is.."+periodictableList.next());
		
	}
	
 		}	
		

	}


