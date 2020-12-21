package JDBC_CODE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCNonQueryCODE 
{
	public static void main(String[] args) throws SQLException
  {
		Connection con = null;
	 try 
		{
			Driver drvref = new Driver();
			DriverManager.registerDriver(drvref);
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
			
			Statement stat = con.createStatement();
			
		int result = stat.executeUpdate("insert into student values ('111','Samar','Selenium')");
			
			}catch(Exception e)
	           {
			
		       }finally{
		       int result = 0;
			if(result==1)
			{
				System.out.println("Project Created");
			}else
			  {
				System.err.println("Project not Created");
			  }		
			  con.close();
			  System.out.println("close connection");
		}	 
	}
}


