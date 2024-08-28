package com.userLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbClass {
	String ad;
	String url = "jdbc:sqlite:C:\\Users\\Sohail\\OneDrive\\Desktop\\chinook\\chinook.db"; // variable to store the location of the data base
	Connection connect;                                        // variable to establish the connection to database
	Statement st;                                             //use to create sql basics statement in java ,its  provides methods to execute query
	static String count;
	String user_name;

	//method to insert data
	public String insert_data(String username, String password) throws ClassNotFoundException, SQLException {
		String query = "insert into login values('" + username + "' ,'" + password + "')";   //query to insert data 
		st.execute(query);                                                                  //statement to execute query
		System.out.println(query);
		System.out.println("done");
		return query;

	}

	//constructor used establish connection
	public DbClass() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:C:\\Users\\Sohail\\OneDrive\\Desktop\\chinook\\chinook.db";
		connect = DriverManager.getConnection(url);
		st = connect.createStatement();
		
		
	}
	
	// method used to update database
	public void updateq(String username, String new_password) throws SQLException {
		String query2="UPDATE login set password='"+ new_password +"' where username='"+ username+"'"; // query to update password
		System.out.println(query2);
		st.execute(query2);
		System.out.println("ff");
	}
	
	//method which return the count of username in db
	public String checkq(String username) throws SQLException {
		String query3="select COUNT(*) from login where username='"+ username+"'";   // query to check the count of username
		//SELECT COUNT(*) FROM campers WHERE counselor="Ashley";
		System.out.println("done");
		ResultSet rs=st.executeQuery(query3);                       // resultset used to run query and point the cursar to the next line
		System.out.println(query3);
		while(rs.next()) {

			
			user_name=rs.getString("COUNT(*)");
			
		
		}
		return  user_name;
	}
	
	//method to get the username
	public String getpassword(String username) throws SQLException {
		String query3="select * from login where username='"+ username+"'";
		//SELECT COUNT(*) FROM campers WHERE counselor="Ashley";
		System.out.println("done");
		System.out.println("inside get password DB");
		ResultSet rs=st.executeQuery(query3);
		System.out.println(query3);
		while(rs.next()) {

			
			user_name=rs.getString("password");
			
		
		}
		return  user_name;
	}
	
	
	//main method 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("check");
		DbClass in = new DbClass();
		in.insert_data("username", "password");
		in.updateq("sohail", "7896");
	 count= in.checkq("sohail");
		System.out.println(count);
		
	
	}


}
