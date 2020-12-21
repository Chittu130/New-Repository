package JDBC_CODE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCCode 
{
	public static void main(String[] args) throws SQLException 
	{
		//step 1 - Register the database driver
		Driver drivref = new Driver();
		DriverManager.registerDriver(drivref);
		
		//step-2 - get the connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
		
		//step-3 - create a statement
	    Statement stat = con.createStatement();
		
		//step-4 - close the query
		ResultSet result = stat.executeQuery("Select * from student");
				
		while(result.next())
		{
			System.out.println(result.getString(1) + "\t"+result.getString(2) + "\t"+result.getString(3));
		}		
		//step-5 -  close the connection
		con.close();
	}
}
