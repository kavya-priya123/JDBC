package ai.jobiak.sql;
import java.sql.*;
public class SelectRecords	//FETCHING ALL RECORDS FROM THE TABLE 
{
	public static void main(String args[])throws Exception
	{
		String url="jdbc:mysql://localhost:/College";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql="SELECT * FROM student";
		ResultSet rs=stmt.executeQuery(sql);
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
