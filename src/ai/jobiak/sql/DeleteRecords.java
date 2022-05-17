package ai.jobiak.sql;
import java.sql.*;
public class DeleteRecords
{
	public static void main(String args[])throws Exception
	{
		String url="jdbc:mysql://localhost:3306:/College";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="DELETE * FROM student where RegdNo=491";
		stmt.executeUpdate(sql);
	}
}
