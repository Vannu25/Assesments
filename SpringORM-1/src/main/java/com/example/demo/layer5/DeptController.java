package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	DepartmentRepositoryImpl deptRepo;
	@GetMapping("/get/{dno}")
	public Department getDept(@PathVariable("dno") int x)
	{
	Department dept;
	dept = deptRepo.selectDepartment(x);
	return dept;
		}
	@GetMapping("/getall")
		public List<Department> getdepts(){
		
		List<Department> deptlist;
		deptlist = deptRepo.selectDepartments();
		return deptlist;
	}
	
		@PostMapping("/add")
		public void addDept(@RequestBody Department deptObj){
			deptRepo.insertDepartment(deptObj);
		
	
}
}
