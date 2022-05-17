/*package ai.jobiak.sql;
import java.sql.*;
public class InsertRecordsUsingPS
{
		public static void main(String args[])throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/world";
			String userName="root";
			String password="admin";
			Connection con=DriverManager.getConnection(url,userName,password);
			PreparedStatement ps=con.prepareStatement("INSERT INTO BankAccount VALUES(?,?,?,?)");
			
	    	ps.setLong(1,499459034);
			ps.setString(2,"ABCD");
			ps.setString(3,"XYZ");
			ps.setInt(4,10000);
			
			ps.setLong(1,447587498);
			ps.setString(2,"EFGH");
			ps.setString(3,"UVW");
			ps.setInt(4,14490);

			ps.setLong(1,5384934);
			ps.setString(2,"IJKL");
			ps.setString(3,"RST");
			ps.setInt(4,334983);
		
			ps.setLong(1,67687498);
			ps.setString(2,"MNOP");
			ps.setString(3,"OPQ");
			ps.setInt(4,3494389);
		
			ps.execute();
			System.out.println("Records Inserted Successfully");
			ResultSet rs=ps.executeQuery("SELECT * FROM BankAccount");
			while(rs.next())
			{
				System.out.println("AccountNo : "+rs.getString(1));
				System.out.println("AHName : "+rs.getString(2));
				System.out.println("Branch Name : "+rs.getString(3));
				System.out.println("Balance : "+rs.getString(4));
				System.out.println();
			}
		}
}*/
