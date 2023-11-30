package jdbcdemo;
import java.sql.*;
import java.util.*;
public class Create_Table {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement st=con.createStatement();
		//int i=st.executeUpdate("create table emps (id int , name varchar(20))");
	
		String sqlquery="create table niru (id int , name varchar(20))";
		st.executeUpdate(sqlquery);
		System.out.println("table created");
	    con.close();	}
	
	
	}

