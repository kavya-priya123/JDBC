package ai.jobiak.sql;
import java.sql.*;
public class CreateTable 
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/College";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="CREATE TABLE student "+
				  "(RegdNo INTEGER NOT NULL, "+
				  "NameoftheStudent VARCHAR(40) NOT NULL, "+
				  "Gender VARCHAR(10) NOT NULL, "+
				  "NameoftheCollege VARCHAR(50) NOT NULL, "+
				  "Stream VARCHAR(40) NOT NULL, "+
				  "DateofBirth DATE NOT NULL, "+
				  "ContactNumber LONG NOT NULL, "+
				  "EmailId VARCHAR(50) NOT NULL, "+
				  "PRIMARY KEY ( RegdNo ))";

		stmt.executeUpdate(sql);
		System.out.println("Table Created Successfully in the Database");
	}
}
/*String sql="CREATE TABLE 'College'.'student'"+
		("Sno" INTEGER NOT NULL,
		  'RegdNo' INTEGER NOT NULL,
		  'NameoftheStudent' VARCHAR(40),
		  'Gender' VARCHAR(10),
		  'NameoftheCollege' VARCHAR(50),
		  'Stream' VARCHAR(40),
		  'DateofBirth' INTEGER,
		  'ContactNumber' INTEGER,
		  'EmailId' VARCHAR(50),
		  PRIMARY KEY('RegdNo'));*/
