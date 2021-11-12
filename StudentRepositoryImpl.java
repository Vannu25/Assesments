package com.example.nsp.layer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.nsp.layer2.Student;


	@Repository
	public class StudentRepositoryImpl extends BaseRepository implements StudentRepository {


		public StudentRepositoryImpl() {
				System.out.println("StudentRepositoryImpl ..");	
		}
		
		@Transactional
		public void insertStudent(Student sobj) {
			
			super.persist(sobj); // invoking the dummy persist of the super class
			System.out.println("Student inserted...");
		}

		@Override
		public Student selectStudent(int sid) {
			
			System.out.println("StudentRepositoryImpl : selecting Student by sid");
			Student stu = super.find(Student.class, sid);
			return stu;
		}

		@Override
		public List<Student> selectStudents() {
			List<Student>  stuList = new ArrayList<Student>();
		
				System.out.println("StudentRepositoryImpl : Selecting all Students...");
				return super.findAll("Student");
			
		}

		@Transactional
		public void updateStudent(Student sobj) {
			
			System.out.println("StudentRepositoryImpl : Updating Student...");
			super.merge(sobj);
		}

		@Transactional
		public void deleteStudent(int sid) {
			// TODO Auto-generated method stub
			System.out.println("StudentRepositoryImpl : Deleting Student");
			super.remove(Student.class, sid);
		}

		@Override
		public void updateStdent(Student sobj) {
			// TODO Auto-generated method stub
			
		}
	
}

	


