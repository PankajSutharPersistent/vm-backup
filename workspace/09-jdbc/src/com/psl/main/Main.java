package com.psl.main;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.psl.beans.Contact;

public class Main {

	public static void main(String[] args) {

		Contact contact=new Contact("Fname1", "Lname1",Date.valueOf("2001-10-10"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			try {
				ResultSet resultSet;
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "root");
				Statement statement=con.createStatement();
				//statement.execute("insert into tbl_contacts(first_name,last_name,date_of_birth) values('"+ contact.getFname()+"','"+ contact.getLname()+"','"+ contact.getDob()+"')");
				PreparedStatement ps;
				ps=con.prepareStatement("insert into tbl_contacts (first_name,last_name,date_of_birth) values(?,?,?)",ResultSet.Ty);
				
				ps.setString(1, "Pankaj");
				ps.setString(2, "Suthar");
				ps.setDate(3, contact.getDob());
				
				ps.executeUpdate();
				
				con.setAutoCommit(false);
				
				resultSet=ps.executeQuery("select * from tbl_contacts");
				while(resultSet.next())
				{
					System.out.println("Contact id=="+resultSet.getInt("contact_id"));
					System.out.println("First Name=="+resultSet.getString("first_name"));

					System.out.println("Last name=="+resultSet.getString("last_name"));
					System.out.println("DOB=="+resultSet.getDate("date_of_birth"));
					System.out.println("-----------------------------------------------------------");

				}
				System.out.println("========================================================");
				
				while(resultSet.previous())
				{
					resultSet.updateString("first_name", contact.getFname()+"new");
					resultSet.updateRow();
					/*System.out.println("Contact id=="+resultSet.getInt("contact_id"));
					System.out.println("First Name=="+resultSet.getString("first_name"));

					System.out.println("Last name=="+resultSet.getString("last_name"));
					System.out.println("DOB=="+resultSet.getDate("date_of_birth"));
					System.out.println("-----------------------------------------------------------");
					*/
				}
				
				con.commit();
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
