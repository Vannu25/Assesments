package com.java.orm;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DepartmentTest {

	
		public static void main(String[] args) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA");
			System.out.println("entity manager factory : "+entityManagerFactory);
			
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			System.out.println("entity manager : "+entityManager);
			
			EntityTransaction transaction = entityManager.getTransaction();
			System.out.println("transaction : "+transaction);
			
			transaction.begin();
			System.out.println("Transaction started....");
			
					Department dept = null;
					System.out.println("null POJO created...");
		
					dept = entityManager.find(Department.class,369);
					System.out.println("DEPTNO : "+dept.getDepartmentNumber());
					System.out.println("DNAME  : "+dept.getDepartmentName());
					System.out.println("DLOC   : "+dept.getDepartmentLoc());
					
					System.out.println("GOT THE POJO FROM DB..");
					System.out.println("RETRIEVED...");
					
			transaction.commit();
			System.out.println("Committed...");
			
	}
}
