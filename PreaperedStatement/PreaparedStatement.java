	package jdbcdemo;
	import java.sql.*;
	import java.util.*;
	public class PreaparedStatement {

		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
	        // Scanner sc=new Scanner(System.in);
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			String sqlquery=" delete from emps where id=? ";
			PreparedStatement pst=con.prepareStatement(sqlquery);
			
			pst.setInt(1, 2);
			pst.executeUpdate();
			System.out.println(" data deletead successfuly");
			
			pst.setInt(1, 10);
			pst.executeUpdate();
			System.out.println(" data deletead successfuly");
			
		    con.close();	}
		
		
		}


