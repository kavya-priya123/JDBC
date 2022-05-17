package ai.jobiak.sql;
import java.sql.*;
public class CreateDatabase
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);	//CONNECTION IS ESTABLISHED
		Statement stmt=con.createStatement();
		String sql="CREATE DATABASE College";
		stmt.executeUpdate(sql);				//executeUpdate -Create,insert,delete,update
		System.out.println("Database Created Successfully");
		con.close();
	}
}
