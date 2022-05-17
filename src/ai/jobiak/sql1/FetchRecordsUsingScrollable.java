/*package ai.jobiak.sql1;
import java.sql.*;
public class FetchRecordsUsingScrollable 
{
	public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
			
			Connection con=DriverManager.getConnection(url,userName,password);  
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);			
			String sql="select * from MailBox";   
			ResultSet rs=st.executeQuery(sql);
			
				rs.first();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				System.out.println();
				rs.next();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				System.out.println();
				rs.previous();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				System.out.println();
				rs.last();
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				System.out.println();
				rs.relative(1);
				System.out.println("After end of the table there is no record exist");
				System.out.println();
				rs.beforeFirst();
				System.out.println("Before first record in the table there is no record exist");
				System.out.println();
				System.out.println("Go to Mail number 3");
				rs.absolute(3);
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				System.out.println();
				rs.absolute(-1);   //A negative number indicates the row number counting from the end of the result set.
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
				
			
	}

}*/