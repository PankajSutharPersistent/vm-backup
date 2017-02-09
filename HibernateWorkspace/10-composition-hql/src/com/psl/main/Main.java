package com.psl.main;

import java.sql.Date;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Account;

import com.psl.bean.User;

public class Main {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1=new User("Warren Buffet");
		User u2=new User("Ratan Tata");

		User u3=new User("Larry Page");

		User u4=new User("Mukesh Ambani");

		User u5=new User("Elon  Musk");
		
		
		u1.addAccount(new Account(1236.252));
		u1.addAccount(new Account(856.32));

		u2.addAccount(new Account(2323.32));
		u2.addAccount(new Account(45555.96));
		u2.addAccount(new Account(253.32));

		u3.addAccount(new Account(1236.785));

		u4.addAccount(new Account(66.25));
		u4.addAccount(new Account(12122.989));


		
		Configuration configuration=new Configuration().configure();
	    SessionFactory sessionFactory=configuration.buildSessionFactory();	
	    Session session=sessionFactory.openSession();
	    Transaction transaction;
	   
	    transaction=session.beginTransaction();
	    
	    //-------------begin transaction
	    
	    session.saveOrUpdate(u1);
	    session.saveOrUpdate(u2);
	    session.saveOrUpdate(u3);
	    session.saveOrUpdate(u4);
	    session.saveOrUpdate(u5);
	    
	    
	    //-------------end transaction
	    transaction.commit();
	    org.hibernate.Query query=session.createQuery("from User");
	    List<User> usr_list= query.list();
	    for(User user:usr_list)
	    {
	    	System.out.println(user.getFullName());
	    }
	    
	    System.out.println("-------------------------------------------Resrtriction----------------");
	    query=session.createQuery("from Account where balance >500.0");
	    List<Account> acs_list=query.list();
	    for(Account account:acs_list)
	    {
	    	System.out.println(account.getBalance());
	    }
	    System.out.println("-----------Named Queries-----------------------");
	    query=session.getNamedQuery("findBalanceLessThan");
	    query.setDouble("value", 500000.00);
	    acs_list=query.list();
	    for(Account account:acs_list)
	    {
	    	System.out.println(account.getBalance());
	    }
	    
	    
	    query=session.createQuery("from User u where u.accounts is empty");
	    usr_list= query.list();
	    for(User user:usr_list)
	    {
	    	System.out.println(user.getFullName());
	    }
	    query= session.createQuery("select u.fullName, a.balance from User u, Account a where u.userId= a.owner.userId");
	    List<Object[]> obj_arr_lst=query.list();
	    for(Object[] obj : obj_arr_lst)
	    {
	    	System.out.println(obj[0]+"------------"+obj[1]);
	    }
	    
	    query= session.createQuery("select u.fullName, a.balance from User u left outer join u.accounts a ");
	    List<Object[]> obj_arr_lstByJoin=query.list();
	    for(Object[] obj : obj_arr_lstByJoin)
	    {
	    	System.out.println(obj[0]+"-------JOIN-----"+obj[1]);
	    }
	    
	    /*   session.createQuery("from User u left outer join u.accounts");
	    List<Object[]> obj_arr_lstByJoinLazy=query.list();
	    for(Object[] obj : obj_arr_lstByJoinLazy)
	    {
	    	System.out.println(obj[0]+"-------LEFT OUTER JOIN-----"+obj[1]);
	    	User u =(User) obj[0];
	    	for(Account a:u.getAccounts())
	    	{
	    		System.out.println(a.getBalance());
	    	}
	    }
	  session.createQuery("from User u left outer join fetch u.accounts");
	      List<Object[]> obj_arr_lstByJoinEager=query.list();
	      for(Object[] obj : obj_arr_lstByJoinEager)
		    {
		    	System.out.println(obj[0]+"------------"+obj[1]);
		    }
	        
	 */ 
	   session.createQuery("select u.fullName,sum(a.balance) from User u left outer join u.accounts a group by u.fullName");
	   List<Object[]> obj_arr_lstByJoinAggregation=query.list();
	      for(Object[] obj : obj_arr_lstByJoinAggregation)
		    {
		    	System.out.println(obj[0]+"------------"+obj[1]);
		    }
	    
	    session.close();
	    sessionFactory.close();
	}

}
