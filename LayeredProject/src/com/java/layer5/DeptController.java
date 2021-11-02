package com.java.layer5;

import com.java.layer2.Department;
import com.java.layer4.DepartmentExistsException;
import com.java.layer4.DepartmentNotFoundException;
import com.java.layer4.DepartmentServiceimpl;

public class DeptController {

	public static void main(String[] args) {

		DepartmentServiceimpl deptService = new DepartmentServiceimpl();
		
		  Department DeptObj = new Department(); 
		  DeptObj.setDepartmentNumber(13);
		  DeptObj.setDepartmentName("def"); 
		  DeptObj.setDepartmentLocation("vn"); 
		  try {
			deptService.createDepartmentService(DeptObj);
		} 
		  catch (DepartmentExistsException e) {
			
			System.out.println("Problem : "+e.getMessage());
		}
		 

		/*List<Department> deptList = deptService.findAllDeptsService();
		for (Department theDept : deptList) {
			System.out.println("Dept NO   : " + theDept.getDepartmentNumber());
			System.out.println("Dept NAME : " + theDept.getDepartmentName());
			System.out.println("Dept LOC  : " + theDept.getDepartmentLocation());
			System.out.println("---------");
		}*/
		
		/*Department theDept;
		try {
			theDept = deptService.findDeptService(137);
			System.out.println("Dept NO   : " + theDept.getDepartmentNumber());
			System.out.println("Dept NAME : " + theDept.getDepartmentName());
			System.out.println("Dept LOC  : " + theDept.getDepartmentLocation());
			System.out.println("---------");
		} catch (DepartmentNotFoundException e) {
			System.out.println("Problem : "+e.getMessage());
		}*/
		
		  Department DeptToDelete = new Department(); 
		  DeptToDelete.setDepartmentNumber(13);
		  DeptToDelete.setDepartmentName("def"); 
		  DeptToDelete.setDepartmentLocation("vn"); 
	try	 { 
	       deptService.removeDepartmentService(13);
	       System.out.println("--------");
	       
	       	}
	catch(DepartmentNotFoundException e){
		System.out.println("Problem : "+e.getMessage());
		 
		/*Department DeptToUpdate = new Department(); 
		  DeptToDelete.setDepartmentNumber(13);
		  DeptToDelete.setDepartmentName("def"); 
		  DeptToDelete.setDepartmentLocation("vn"); 
	try	 { 
	       deptService.modifyDepartmentService("");
	       System.out.println("--------");
	       
	       	}
	catch(DepartmentNotFoundException e){
		System.out.println("Problem : "+e.getMessage());
	}*/
	
	}}
	}

