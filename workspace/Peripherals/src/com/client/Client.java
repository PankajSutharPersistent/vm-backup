package com.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.beans.Peripheral;
import com.util.quantityPrice;

public class Client {
	
	static Set<Peripheral> perSet=new TreeSet<Peripheral>();

	public static void main(String[] args) {
		/* write your code here */
		readPeripheralInventory(perSet);
		insertPeripheralRecords(perSet);
		
		Set<Peripheral> pp=sortInventoryByPrice(perSet);
		Set<Peripheral> ppp=sortInventoryByQuantityPrice(perSet);
		for(Peripheral p :ppp)
		{
			System.out.println(p.getQuantity()+"...."+p.getPrice());
			
		}
		
		
		Set<Peripheral> pppp=filterInventoryByPrice(1000, 20000, perSet);
	}

	/** this method will read peripheral details from the CSV file
	given to you and populate the Set*/
	public static void readPeripheralInventory(Set<Peripheral> peripherals) {
		
		String line=null;
		try {
			FileReader fr=new FileReader("Peripherals.txt");
			BufferedReader br=new BufferedReader(fr);
			try {
				while((line=br.readLine())!= null && line.length()!=0)
				{
					Peripheral probj=new Peripheral();
				System.out.println(line);	
				String[] tempData=line.split(",");
				probj.setItemCode(tempData[0]);
				probj.setName(tempData[1]);
				probj.setDescription(tempData[2]);
				probj.setPrice(Integer.parseInt(tempData[3]));
				probj.setQuantity(Integer.parseInt(tempData[4]));
				perSet.add(probj);
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		/* write your code here */
	}

	/** this method will insert the peripheral information read earlier
	into a database table */
	public static void insertPeripheralRecords(Set<Peripheral> peripherals) {
		/* write your code here */
		Connection con;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/peri", "root", "root");
				for(Peripheral p:peripherals)
				{
					PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?,?,?)");
					ps.setString(1, p.getItemCode());
					ps.setString(2, p.getName());
					ps.setString(3, p.getDescription());
					ps.setInt(4, p.getPrice());
					ps.setInt(5,p.getQuantity());
					
					ps.executeUpdate();
				}
				 
				
				
				
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
	}

	/** this method will sort a given Set by price in the ascending order.
	It will create a new ordered Set and return it. */
	public static Set<Peripheral>  sortInventoryByPrice(Set<Peripheral> peripherals) {
		/* write your code here */
		
		for(Peripheral p:peripherals)
		System.out.println(p.getPrice());
		
		return peripherals;
	}

	/** this method will sort a given Set by quantity in the ascending order.
	Peripherals with the same quantity should be sorted amongst themselves 
	by price in the ascending order. It will return a new Set with the sorted objects */
	public static Set<Peripheral>  sortInventoryByQuantityPrice(Set<Peripheral> peripherals) {
		/* write your code here */
		Set<Peripheral> newSet=new TreeSet<Peripheral>(new quantityPrice());
		newSet.addAll(peripherals);
		return newSet;
	}

	/** this method will return a new Set with records filtered from an existing Set on the basis
	of price. Both prices are inclusive. */
	public static Set<Peripheral> filterInventoryByPrice(int startingPrice, int endingPrice, Set<Peripheral> peripherals) {
		/* write your code here */
		Set<Peripheral> tempSet=new TreeSet<Peripheral>();
		for(Peripheral p: peripherals)
		{
			if(p.getPrice()>startingPrice && p.getPrice()<endingPrice)
			{
				tempSet.add(p);
			}
		}
		return null;
	}
}
