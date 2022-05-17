package ai.jobiak.sql;
import java.sql.*;
public class SelectDatabase 
{
	public static void main(String args[])throws Exception
	{
		String url="jdbc:mysql://localhost:/College";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("Connected to Database Successfully");		
	}
}
