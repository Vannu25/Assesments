import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//1 - registration of Driver
  DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");
			
			//2 - establish the connection
  Connection conn = DriverManager.getConnection(
				"jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected...."+conn);
			
			//3. - decide your statement   DQL / DML / PLSQL
			Statement st = conn.createStatement();
			
			//4 - run the query and acquire the result
			
			System.out.println("Which UserReg mail to search ? ");
			Scanner scan = new Scanner(System.in);
			String dummyUmail = scan.nextLine();
			
			ResultSet result2 = st.executeQuery("select * from UserReg where Umail="+dummyUmail);
			
			
			//5 - process the result 
			if( result2.next() ) {
				String Umail1 = result2.getString(1);
				String Pwd = result2.getString(2);
				int Age = result2.getInt(3);
				String Add = result2.getString(4);
				
				System.out.println("String1  : "+Umail1);
				System.out.println("STRING2   : "+Pwd);
				System.out.println("int3   : " +Age);
				System.out.println("STRING4   : "+Add);
				System.out.println("--------------------");
			} else {
				
				//System.out.println("Department not found....");
				//throw new RuntimeException ("Department NOT found "+dummyDeptno);
				throw new UserNotFoundException("user Does not exists!!!"+dummyUmail);
				
			}
			
			result2.close();
			st.close();
			conn.close();
			
		} catch (SQLException | UserNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
