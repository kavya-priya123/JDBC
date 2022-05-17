package ai.jobiak.sql1;
import java.sql.*;
public class CreateTable2 {
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/world";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE MailBox"
					+"("
				    +"MailFrom VARCHAR(40),"
				    +"Subject VARCHAR(40),"
				    +"Content VARCHAR(50),"
				    +"Size int"
				    +")";
		stmt.executeUpdate(sql);
		System.out.println("Table Created Successfully in the Database");
	}
}
