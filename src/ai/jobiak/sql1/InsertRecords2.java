package ai.jobiak.sql1;
import java.sql.*;
import java.util.Scanner;
public class InsertRecords2
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:/world";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		PreparedStatement ps=con.prepareStatement("INSERT INTO MailBox VALUES(?,?,?,?)");
		/*
    	ps.setString(1,"djkjdjk@gmail.com");
		ps.setString(2,"Assessment");
		ps.setString(3,"You have to do all the tasks");
		ps.setInt(4,28);
		ps.executeUpdate();*/
		 String from=sc.nextLine();
	     String subject=sc.nextLine();
		 String content=sc.nextLine();
			ps.setString(1,from);
			ps.setString(2,subject);
			ps.setString(3,content);
			ps.setInt(4,content.length());
			ps.executeUpdate();
	}
}
