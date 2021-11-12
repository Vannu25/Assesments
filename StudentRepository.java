package com.example.nsp.layer3;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nsp.layer2.Student;

@Repository
public interface StudentRepository 
{
			void insertStudent(Student sobj); //C
			
			Student selectStudent(int sid); //R
			List<Student> selectStudents(); //RA
			
			void updateStdent(Student sobj); //U
			void deleteStudent(int sid); //D
			
		}

