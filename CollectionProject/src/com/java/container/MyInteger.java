package com.java.container;

public class MyInteger {

	
			private int x;
			private int y;
			
			public MyInteger (int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}

		public void swap() {
			System.out.println(" Swapping...");
			int temp=x;
			x=y;
			y=temp;
			
		}
		public void print() {
			System.out.println("x" +x);
			System.out.println("y" +y);
			
			}
		

	}

