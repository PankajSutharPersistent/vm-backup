package com.psl.main;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import javax.jws.soap.SOAPBinding.Use;


import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

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
	    
	    session.persist(u1);
	    session.persist(u2);
	    session.persist(u3);
	    session.persist(u4);
	    session.persist(u5);
	    
	    
	    //-------------end transaction
	    transaction.commit();
	   session.clear();
	   
	   User u=(User) session.get(User.class, new Integer(1));
	   System.out.println(u.getFullName());
	   session.enableFilter("balanceLessThan").setParameter("amt", 500.00);
	   for(Account a:u.getAccounts())
	   {
		   System.out.println(a.getBalance()+"=======================");
	   }
	    session.close();
	    sessionFactory.close();
	}

}
