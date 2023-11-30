package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement st=con.createStatement();
		
	
		String sqlquery1=" insert into emps values(2,'niranjan') ";
		st.executeUpdate(sqlquery1);
		System.out.println(" data inserted");
		
	    con.close();	}
	}

}
