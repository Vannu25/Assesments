package com.java.layer3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.java.layer2.Department;


public class DepartmentDAOimpl implements DepartmentDAO {

	Connection conn;
	 
	public DepartmentDAOimpl() {
		try {
			System.out.println("DepartmentDAOimpl : Loading the driver...getting the connection...");
			//1 - registration of Driver
			  DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
						System.out.println("Driver registerdd....");
						
						//2 - establish the connection
			   conn = DriverManager.getConnection(
							"jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
						System.out.println("Connected...."+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void insertDepartment(Department dobj) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentDAOimpl : insertDepartment(Department) -  inserting department...");
		try {
				//3. - decide your statement   DQL / DML / PLSQL
			PreparedStatement pst = conn.prepareStatement("insert into dept values (?,?,?)");;
			pst.setInt(1, dobj.getDepartmentNumber());
			pst.setString(2, dobj.getDepartmentName());
			pst.setString(3, dobj.getDepartmentLocation());
			int rows = pst.executeUpdate();
			System.out.println("Row created : "+rows);

			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Department selectDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentDAOimpl : selecting department by deptno");
		Department dept = null;
		try {
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept where deptno="+dno);
				if(rs.next() ) {
					dept = new Department();
					dept.setDepartmentNumber(rs.getInt(1));
					dept.setDepartmentName(rs.getString(2));
					dept.setDepartmentLocation(rs.getString(3));
					
				}
		}
		catch (SQLException e) {	e.printStackTrace(); }
		return dept;
	}

	@Override
	public List<Department> selectDepartments() {
		List<Department>  deptList = new ArrayList<Department>();
		try {
			System.out.println("DepartmentDAOImpl : Selecting all departments...");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from dept");
				while(rs.next() ) {
					Department dept=new Department();
					dept.setDepartmentNumber(rs.getInt(1));
					dept.setDepartmentName(rs.getString(2));
					dept.setDepartmentLocation(rs.getString(3));
					deptList.add(dept);// add the obj to the list
				}
		} catch (SQLException e) {	e.printStackTrace(); }
		return deptList;
	}

	@Override
	public void updateDepartment(Department dobj) {
		System.out.println("DepartmentDAOImpl : Updating department...");
		try {
			//3. - decide your statement   DQL / DML / PLSQL
		PreparedStatement pst = conn.prepareStatement("update dept set dname=?,Loc=? where deptno=? ");
		pst.setInt(1, dobj.getDepartmentNumber());
		pst.setString(2, dobj.getDepartmentName());
		pst.setString(3, dobj.getDepartmentLocation());
		int rows = pst.executeUpdate();
		System.out.println("updated  : "+rows);

		pst.close();
		conn.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
		
	
	@Override
	public void deletDepartment(int dno) {
		// TODO Auto-generated method stub
		System.out.println("DepartmentDAOImpl : Deleting department");
		try {
			//3. - decide your statement   DQL / DML / PLSQL
		PreparedStatement pst = conn.prepareStatement("delete from dept where dno=? ");
		pst.setInt(1, dno);
		
		int rows = pst.executeUpdate();
		System.out.println("Deleted : "+rows);

		pst.close();
		conn.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}