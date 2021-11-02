import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserReg {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registerdd....");


			 Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected...."+conn);


			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			Scanner scan4 = new Scanner(System.in);

			System.out.println("Enter your user mail : ");
			String Umail = scan1.nextLine();


			System.out.println("Enter your password : ");
			String Pwd = scan2.nextLine();

			System.out.println("Enter your Age  : ");
			int Age = scan3.nextInt();

			System.out.println("Enter your Address  : ");
			String Add = scan4.nextLine();
  
			Person person = new Person(Umail,Pwd,Age,Add);
			
			PreparedStatement pst = conn.prepareStatement("insert into UserReg values (?,?,?,?)");
			pst.setString(1, Umail);
			pst.setString(2, Pwd);
			pst.setInt(3, Age);
			pst.setString(4, Add);
			int rows = pst.executeUpdate();
			System.out.println("User Registration success : "+rows);


			pst.close();
			conn.close();

			}
			catch (SQLException e) {

			e.printStackTrace();
			}

	}


}


