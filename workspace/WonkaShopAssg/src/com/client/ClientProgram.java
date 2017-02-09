package com.client;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.bean.Transaction;
import com.bean.User;
import com.exception.InsufficientChocolates;
import com.exception.InvalidPasswordException;
import com.exception.InvalidUserException;

public class ClientProgram {
	
	static List<Product> listProduct=new ArrayList<Product>();
	static User usr=new User((long)1, "Mr. Cadbury");


	
	
	
	public static void showAvailabledetails()
	{
		System.out.println("Available Chocolates in store");
    	Connection con=null;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wonka_shop", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from productdetails");
			ResultSet rs=ps.executeQuery();
			System.out.println("Available Chocolate in store");
			while(rs.next())
			{
				if(Integer.parseInt(rs.getString(4))>0)
				{
				System.out.println();
				System.out.println(rs.getString(2)+" Available== "+rs.getString(4));
				}
				}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
    	
	}
	
	public static List<Transaction> updateAndCheckAvailabilty(User purchasinguser, String name,int quantity)
	{
		System.out.println(name);
		List<Transaction> tList=new ArrayList<Transaction>();
		System.out.println("Checking availability");
    	Connection con=null;
    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wonka_shop", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PreparedStatement ps=con.prepareStatement("select * from productdetails where name=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				int qInDatabase=Integer.parseInt(rs.getString(4));
				int avail=qInDatabase-quantity;
				System.out.println(avail+"pppppppppppppppppppppppppp");
				if(avail<0)
				{
					try {
						throw new InsufficientChocolates();
					} catch (InsufficientChocolates e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					
					float total=quantity*(Float.parseFloat(rs.getString(3)));
					Product penter = null;
					int id=Integer.parseInt(rs.getString(1));

					for(Product p: listProduct)
					{
						if(p.getItemCode()==id)
						{
							penter=p;
						}
					}
					System.out.println(penter.getItemCode()+"   "+penter.getName());
				Transaction t=new Transaction(penter, purchasinguser, quantity, total);
				tList.add(t);
				PreparedStatement ps1=con.prepareStatement("UPDATE productdetails SET quantity=? where name=?");
				ps1.setInt(1, avail);
				ps1.setString(2, name);
				ps1.executeUpdate();
				break;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return tList;
		
		
		
		
	}


	
	public static void main(String[] args) throws InvalidUserException, InvalidPasswordException {
		ClientProgram cp=new ClientProgram();
		List<Product> readproductList=cp.readProductsFromFile("Wonka_Products.txt");
		List<User> resultUserList=cp.initUsers();
		Boolean isUseruthenticated=cp.authenticate(usr, resultUserList);
		System.out.println("User Authenticated "+isUseruthenticated);
		List<Transaction> transaction=new ArrayList<Transaction>();
		cp.processOrder(transaction);
	
	
	}
	public List<Product> readProductsFromFile(String fullFilePath){
		String line=null;
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wonka_shop", "root", "root");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader(fullFilePath);
			BufferedReader br=new BufferedReader(fr);
			try {
				while((line=br.readLine())!=null)
				{
					String[] tempResult=line.split("\t");
					Product p=new Product(Integer.parseInt(tempResult[0]),tempResult[1],(float) Double.parseDouble(tempResult[2]),Integer.parseInt(tempResult[3]));
					listProduct.add(p);
					try {
						
						PreparedStatement ps=con.prepareStatement("insert into productdetails values(?,?,?,?)");
						ps.setInt(1, (int) p.getItemCode());
						ps.setString(2, p.getName());
						ps.setDouble(3, p.getPrice());
						ps.setInt(4, (int)p.getQuantity());
						ps.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return listProduct;
		//TODO: Return valid list of products
	}
	
	//---------------------------------------------------------------------------------
	
	public List<User> initUsers(){
		
		User u1=new User((long) 1, "Mr. Cadbury");
		User u2=new User((long) 2, "Mrs. Lindt");
		List<User> listUser=new ArrayList<User>();
		listUser.add(u1);
		listUser.add(u2);
		return listUser;
		//TODO: Return valid list 
	}
	//--------------------------------------------------------------------------------
	
	public boolean authenticate(User user, List<User> users) throws InvalidUserException, InvalidPasswordException{
		
		int flag=0;
		for(User u:users)
		{
			if(u.getName().toString().equals(user.getName().toString()))
			{
				flag=1;
				if(u.getId()==user.getId())
				{
					return true;
				}
				else
				{
					throw new InvalidPasswordException();
				}
			}
			
		}
		if(flag==0)
		{
			throw new InvalidUserException();
		}
		else
		{
			return true;
		}
		
		//TODO:Implement and return valid value
	}
	//------------------------------------------------------------------------------------------------
	
    public void processOrder(List<Transaction> transactions){
    	String s="";
    	Connection con=null;
    	while(true)
    	{
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wonka_shop", "root", "root");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

    		
    		
    		
    		
    		
    		
    		showAvailabledetails();
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter which and how many chocolate you want?\nIf you want to exit pass exit and 0=======");
    		String name=sc.nextLine();
    		int q=sc.nextInt();
    		if(name.equals("exit"))
    		{
    			break;
    		}
    		else
    		{
    			ClientProgram cp=new ClientProgram();
    		List<Transaction> transactionList=updateAndCheckAvailabilty(usr,name, q);
    		for(Transaction t:transactionList)
    		{
    			PreparedStatement ps = null;
				try {
					ps = con.prepareStatement("insert into bill_tbl values(?,?,?,?)");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		try {
				ps.setLong(1, t.getMember().getId());
				System.out.println(t.getItem().getName()+t.getItem().getItemCode()+t.getItem().getPrice());
				ps.setInt(2, t.getItem().getItemCode());
				ps.setInt(3, t.getQuantity());
				ps.setFloat(4, t.getTotal());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    			
    			try {
					ps.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    		}
    	}
    	
    	
    	
    	
    	
    	
    	//TODO:Implement process order
    }
    
    public List<Transaction> getPurchaseTransactionsFromDb(){
    	Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wonka_shop", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		try {
			PreparedStatement ps=con.prepareStatement("select * from bill_tbl");
			ResultSet rs=ps.executeQuery();
			while (rs.next()) {
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return null;
    	//TODO:Implement and return valid list
    }
    
    public double calculateFinalBillAmount(List<Transaction> purchaseList){
    	return 0;
    	//TODO:Implement and return a valid amount
    }
}