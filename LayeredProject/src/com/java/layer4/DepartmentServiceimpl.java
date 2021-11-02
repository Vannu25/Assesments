package com.java.layer4;

import java.util.List;

import com.java.layer2.Department;
import com.java.layer3.DepartmentDAOimpl;

public class DepartmentServiceimpl implements DepartmentService {

DepartmentDAOimpl deptDao = new DepartmentDAOimpl();
	
	public DepartmentServiceimpl() {
		System.out.println("DepartmentServiceimpl : DepartmentServiceimpl() constructor....");
	}
	@Override
	public void createDepartmentService(Department dobj) throws DepartmentExistsException
	{ //37 QA ND
			Department dummyDept = deptDao.selectDepartment(dobj.getDepartmentNumber());
			if(dummyDept != null ) {
				DepartmentExistsException dee = new DepartmentExistsException("This department number already exists "+dobj.getDepartmentNumber());
				throw dee;
			}
			else {
				System.out.println("=>createDepartmentService() started");
				deptDao.insertDepartment(dobj);
				System.out.println("DepartmentServiceimpl :  createDepartmentService() invoked....");
				System.out.println("=>createDepartmentService() finished");
			}
	  
	}
	
	public List<Department> findAllDeptsService()
	{
		return deptDao.selectDepartments();
	}
	
	public Department findDeptService(int dno) throws DepartmentNotFoundException
	{
		Department dept = deptDao.selectDepartment(dno);
		if(dept == null) {
			throw new DepartmentNotFoundException("Department Not found : "+dno);
		}
		return dept;
	}

public void modifyDepartmentService(Department dobj) throws DepartmentNotFoundException {
		
		Department dummyDept = deptDao.selectDepartment(dobj.getDepartmentNumber());
		
	if (dummyDept == null){
		DepartmentNotFoundException dnfe= new DepartmentNotFoundException("number exist" +dobj.getDepartmentNumber());
		throw dnfe;
}
else
	deptDao.updateDepartment(dobj);
}

	public void removeDepartmentService(int dno)  throws DepartmentNotFoundException {
	Department dummyDept = deptDao.selectDepartment(dno);
	 if (dummyDept == null){
		DepartmentNotFoundException dnfe= new DepartmentNotFoundException("Department not found " +dno);
		throw dnfe;
}	else
	deptDao.deletDepartment(dno);
}
	@Override
	public void modifyDepartment(int dno) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeDepartment(int dno) {
		// TODO Auto-generated method stub
		
	}

}