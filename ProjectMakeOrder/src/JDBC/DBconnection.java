package JDBC;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


 public class DBconnection  {  {

 				try{
				 Class.forName("com.mysql.jdbc.Driver");
				 } catch (ClassNotFoundException ex){
				 System.out.println("Error found " + ex);
				 }
	
				 final String url = "hildur.ucn.dk";
				 final String databaseName = "DatabaseName=dmaa0221_1089452"; 
				 final String userName = "dmaa0221_1089452";
				 final String password = "Password1!"; 
				 final String driver = "jdbc:sqlserver:/"; {
				 }
 
				 try {
					Connection con= DriverManager.getConnection(url,userName,password);
					System.out.println("connection alive");
					
				connection.setAutCommit(false);
				connection.commit( );
				}
				 catch(Exception e) {

				connection.rollback();
		
				}
				 finally {
				connection.setAutCommit(true);
				
				} 
 	 
}}
 	