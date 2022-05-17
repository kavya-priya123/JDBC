package ai.jobiak.sql1;
import java.sql.*;
import java.util.*;
public class Fetching 
{
	public static void main(String args[])throws Exception
	{
			String url="jdbc:mysql://localhost:/world";
			String userName="root";
			String password="admin";
			Connection con=DriverManager.getConnection(url,userName,password);
			Scanner sc=new Scanner(System.in);
			System.out.println("--------------------Menu--------------------");
			System.out.println("_____________________________________________");
			System.out.println("Enter your choice");
			System.out.println("1.First");
			System.out.println("2.Next");
			System.out.println("3.Previous");
			System.out.println("4.Last");
			System.out.println("5.Go to Position");
			System.out.println("6.Exit");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql="SELECT * FROM MailBox";
			ResultSet rs=st.executeQuery(sql);
			/*while(rs.next())
			{
				System.out.println(rs.getString(1)+"::"+rs.getString(2)+"::"+rs.getString(3)+"::"+rs.getInt(4));
			}*/	
		
			//System.out.println("Enter a Mail Number:");
			//Scanner sc=new Scanner(System.in);
		while(true)
		{
			int op=sc.nextInt();    
	        switch(op)
  	        { 
		      case 1:
		    	  		//rs.absolute(1);
		    	  		rs.first();
		    	  		System.out.println("From :"+rs.getString(1)+"::"+"Subject :"+rs.getString(2)+"::"+"Content :"+rs.getString(3)+"::"+"Size :"+rs.getInt(4));
		    	  		break;
		    	  		
		     case 2:
		    	  		//rs.absolute(2);
		    	 		if(rs.next()==true)
		    	 		System.out.println("From :"+rs.getString(1)+"::"+"Subject :"+rs.getString(2)+"::"+"Content :"+rs.getString(3)+"::"+"Size :"+rs.getInt(4));
		    	  		else
		    	  		System.out.println("You reached last mail");
		    	 		break;
			 case 3:
						//rs.absolute(3);
				 		if(rs.previous()==true)
				 		System.out.println("From :"+rs.getString(1)+"::"+"Subject :"+rs.getString(2)+"::"+"Content :"+rs.getString(3)+"::"+"Size :"+rs.getInt(4));
				 		else
				 		System.out.println("You don't have any new mail");
		      			break;
		      			
		     case 4:
		    	 		//rs.absolute(4);
		    	 		if(rs.last()==true)
		    	 		System.out.println("From :"+rs.getString(1)+"::"+"Subject :"+rs.getString(2)+"::"+"Content :"+rs.getString(3)+"::"+"Size :"+rs.getInt(4));
		     			break;
		     case 5:
	    	 			//rs.absolute(5);
		    	 		System.out.println("Enter Record number");
		    	 		int n=sc.nextInt();
	    	 			rs.absolute(n);
	    	 			System.out.println("From :"+rs.getString(1)+"::"+"Subject :"+rs.getString(2)+"::"+"Content :"+rs.getString(3)+"::"+"Size :"+rs.getInt(4));
	    	 			break;
		    case 6:
		    			System.out.println("Exit");
		    			break;
		    default:
						System.out.println("Entered Mail Number does not exist");
	          }
		}
	}
}