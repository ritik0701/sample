package com.rest.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	 public Connection createConn()
	    {
	    	Connection con = null;
			String username = "sys as sysdba";
		    String password = "ritik123";
		    try
		    	{
		    	  Class.forName("oracle.jdbc.OracleDriver");
		    	  con=DriverManager.getConnection("jdbc:oracle:thin:" + username + "/" + password + "@localhost:1521:xe");
	        }
	        catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        return con;
	    }
	 
		public static void main(String Args[]) throws SQLException {
			
			System.out.print(new DBConnect().createConn());
		}
	}
