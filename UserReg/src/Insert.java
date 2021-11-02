import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

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
			
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			Scanner scan4 = new Scanner(System.in);
			
			System.out.println("Enter User Umail : ");
			String Umail = scan1.nextLine();
			
			System.out.println("Enter User Pwd : ");
			String Pwd = scan2.nextLine();

			System.out.println("Enter User Age  : ");
			int Age = scan3.nextInt();
			
			System.out.println("Enter User Add : ");
			String Add  = scan4.nextLine();
			
			//3. - decide your statement   DQL / DML / PLSQL
			PreparedStatement pst = conn.prepareStatement("insert into UserReg values (?,?,?,?)");
			pst.setString(1, Umail);
			pst.setString(2, Pwd);
			pst.setInt(3, Age);
			pst.setString(4, Add);
			int rows = pst.executeUpdate();
			System.out.println("Row created : "+rows);
			
			pst.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}