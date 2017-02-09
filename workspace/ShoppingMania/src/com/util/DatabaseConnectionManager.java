package com.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionManager implements DBConnectionUtil {	
	
	public DatabaseConnectionManager() { /*does nothing*/ }
	
	Connection con=null;

	public Connection getConnection() throws ClassNotFoundException,
			SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeConnection() throws SQLException {
		// TODO Auto-generated method stub
		
	}
	
	
}
