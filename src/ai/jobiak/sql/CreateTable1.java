package ai.jobiak.sql;
import java.sql.*;
public class CreateTable1 
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/world";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE BankAccount"
					+"("
				    +"NameofAH VARCHAR(40),"
				    +"AccountNumber LONG,"
				    +"Branch VARCHAR(50),"
				    +"Balance int"
				    +")";

		stmt.executeUpdate(sql);
		System.out.println("Table Created Successfully in the Database");
	}
}
