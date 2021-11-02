package com.java;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Car theCar = (Car) container.getBean("mycar");
		
		theCar.startCar();
		
		Department theDepartment = (Department) container.getBean("myDepartment");
		
		//theDepartment.setDepartmentNumber(5);
		System.out.println ("Dno :" +theDepartment.getDepartmentNumber());
		
	//	theDepartment.setDepartmentName("vanu");
	   System.out.println ("Dname :" +theDepartment.getDepartmentName());

		
	//  theDepartment.setDepartmentLoc("Kp");
		System.out.println ("DLoc :"  +theDepartment.getDepartmentLoc());

		
		/*Employee theEmployee = (Employee) container.getBean("myEmployee");
		
		theEmployee.setEmpNumber(15);
		System.out.println ("Eno 01");
		
		theEmployee.setEmpName("vanz");
		System.out.println ("Ename vanz");
		
		theEmployee.setEmpSal(15000);
		System.out.println ("Esal 15000" );
		
       Employee theEmployee1 = (Employee) container.getBean("myEmployee1");
		
		theEmployee1.setEmpNumber(01);
		System.out.println ("Eno 01");
		
		theEmployee1.setEmpName("xyz");
		System.out.println ("Ename xyz");
		
		theEmployee1.setEmpSal(25000);
		System.out.println ("Esal 25000");
	}*/
}
}
