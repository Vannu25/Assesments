package com.java.container;

public class ChemicalElement implements Comparable<ChemicalElement> {

	
		// TODO Auto-generated method stub
		private int atomicNumber;
		private String atomicName;
		private String atomicFormula;
		private double atomicWeight;
		
@Override
    public String toString() {
     return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
			+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
}


	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, double atomicWeight) {
			super();
			this.atomicNumber = atomicNumber;
			this.atomicName = atomicName;
			this.atomicFormula = atomicFormula;
			this.atomicWeight = atomicWeight;
		}
	
	@Override
	public int compareTo(ChemicalElement o) {
		// TODO Auto-generated method stub
		System.out.println("comparing "+atomicFormula+ " with "+o.atomicFormula);
		return atomicFormula.compareTo(o.atomicFormula);
		
	}
}


