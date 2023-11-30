package jdbcdemo;
import java.sql.*;
import java.util.*;
public class InsertMultiple {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        // Scanner sc=new Scanner(System.in);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
	while(true) {
		
		System.out.println("Employee id");
		int id=sc.nextInt();
		System.out.println("Employee name");
		String name=sc.next();

		String sqlquery1=String.format(" insert into emps values(%d,'%s')",id,name);
		st.executeUpdate(sqlquery1);
		System.out.println(" data inserted");
		
		System.out.println("do you want to enter more data");
		String option=sc.next();
		
		if(option.equalsIgnoreCase("no"))
		{
			break;
		}
	
	}
	    con.close();	
	
	
	}

	}
