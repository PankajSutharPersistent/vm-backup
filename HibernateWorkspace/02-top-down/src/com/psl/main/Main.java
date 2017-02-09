package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Contact;

public class Main {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact c1=new Contact("firstName1", "lastName1", "email1", Date.valueOf("2001-01-01"));
		Contact c2=new Contact("firstName2", "lastName2", "email2", Date.valueOf("2002-02-02"));
		Configuration configuration=new Configuration().configure();
	    SessionFactory sessionFactory=configuration.buildSessionFactory();	
	    Session session=sessionFactory.openSession();
	    Transaction transaction;
	   
	    transaction=session.beginTransaction();
	    
	    //-------------begin transaction
	    
	    session.save(c1);
	    session.save(c2);
	    
	    
	    //-------------end transaction
	    transaction.commit();
	    session.close();
	    sessionFactory.close();
	}

}
