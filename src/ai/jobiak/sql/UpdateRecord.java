package ai.jobiak.sql;
import java.sql.*;
public class UpdateRecord
{
	public static void main(String args[]) throws SQLException
	{
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/College";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="UPDATE student SET NameoftheStudent='S.Susmitha' WHERE RegdNo=421";
		stmt.executeUpdate(sql);
		String query="SELECT * FROM student";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println("Registered No : "+rs.getInt("RegdNo"));
			System.out.println("Student Name : "+rs.getString("Nameofthestudent"));
			System.out.println("Gender : "+rs.getString("Gender"));
			System.out.println("College Name : "+rs.getString("NameoftheCollege"));
			System.out.println("Branch : "+rs.getString("Stream"));
			System.out.println("Date of Birth : "+rs.getDate("DateofBirth"));
			System.out.println("Mobile No. : "+rs.getLong("ContactNumber"));
			System.out.println("Mail Id : "+rs.getString("EmailId"));
			System.out.println();
		}
	}
}
		


