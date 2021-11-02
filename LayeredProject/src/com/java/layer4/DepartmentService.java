package com.java.layer4;

import java.util.List;

import com.java.layer2.Department;

public interface DepartmentService {
	
	void createDepartmentService(Department dobj) throws DepartmentExistsException; //C
	List<Department> findAllDeptsService(); //RA
	
	Department findDeptService(int dno) throws DepartmentNotFoundException;
	void modifyDepartment( int dno);
	void removeDepartment(int dno);
	
	
}