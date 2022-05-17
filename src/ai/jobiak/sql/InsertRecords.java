package ai.jobiak.sql;
import java.sql.*;
public class InsertRecords
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:/College";
		String userName="root";
		String password="admin";
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String sql1="Insert INTO student VALUES(497,'P.Gayathri','Female','UCET','ECE','2000-12-22',9640664499,'paturigayathri765@gmail.com')";	//INSERT THE RECORDS INTO TABLE
		long count1=stmt.executeUpdate(sql1);
		String sql2="INSERT INTO student VALUES(495,'P.Pravallika','Female','UCET','ECE','2000-11-09',9346330764,'pravallikapakanati7@gmail.com')";	//date of birth data_type is Date-format:YYYT-MM-DD
		long count2=stmt.executeUpdate(sql2);
		String sql3="INSERT INTO student VALUES(421,'S.Sussu','Female','UCET','ECE','1999-01-24',9515817875,'susmithasunkara@gmail.com')";
		long count3=stmt.executeUpdate(sql3);
		String sql4="INSERT INTO student VALUES(422,'S.Harshitha','Female','UCET','ECE','2000-12-13',8297271363,'s.harshitha132000@gmail.com')";
		long count4=stmt.executeUpdate(sql4);
		String sql5="INSERT INTO student VALUES(476,'M.Kalyani','Female','UCET','ECE','2001-01-06',9550381015,'mureboinakalyani@gmail.com')";
		long count5=stmt.executeUpdate(sql5);
		String sql6="INSERT INTO student VALUES(462,'A.Keerthi','Female','UCET','ECE','2001-03-31',9492083846,'keerthialla312001@gmail.com')";
		long count6=stmt.executeUpdate(sql6);
		String sql7="INSERT INTO student VALUES(481,'J.Asritha','Female','UCET','ECE','2001-03-01',6309289968,'asrithajallela@gmail.com')";
		long count7=stmt.executeUpdate(sql7);
		String sql8="INSERT INTO student VALUES(461,'A.Anitha','Female','UCET','ECE','2001-11-25',6304460500,'anithaaradesi@gmail.com')";
		long count8=stmt.executeUpdate(sql8);
		String sql9="INSERT INTO student VALUES(411,'S.Neelima','Female','UCET','ECE','2000-09-02',6304538766,'Sagilineelima@gmail.com')";
		long count9=stmt.executeUpdate(sql9);
		String sql10="INSERT INTO student VALUES(494,'N.Ravali','Female','UCET','ECE','2000-06-08',9133911597,'ravalinelluri2000@gmail.com')";
		long count10=stmt.executeUpdate(sql10);
		long total=count1+count2+count3+count4+count5+count6+count7+count8+count9+count10;
		System.out.println(total+": Records are inserted");
		System.out.println("Records Inserted Successfully in the table");
	}
}
