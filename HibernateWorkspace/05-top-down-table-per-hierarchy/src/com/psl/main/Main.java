package com.psl.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.psl.bean.Address;
import com.psl.bean.Contact;
import com.psl.bean.Employee;
import com.psl.bean.Friends;
import com.psl.bean.Relative;

public class Main {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contact c1=new Employee("firstName1", "lastName1", "email1", Date.valueOf("2001-01-01"),new Address("city1", "country2"), "EMP_CODE-001", "Desig1");
		Contact c2=new Friends("firstName2", "lastName2", "email2", Date.valueOf("2002-02-02"),new Address("city2", "country2"), "PetName2");
		
		Contact c3=new Relative("firstName3", "lastName3", "email3", Date.valueOf("2003-03-03"),new Address("city3", "country3"), "Relation3");

		Configuration configuration=new Configuration().configure();
	    SessionFactory sessionFactory=configuration.buildSessionFactory();	
	    Session session=sessionFactory.openSession();
	    Transaction transaction;
	   
	    transaction=session.beginTransaction();
	    
	    //-------------begin transaction
	    
	    session.save(c1);
	    session.save(c2);
	    session.save(c3);
	    
	    
	    //-------------end transaction
	    transaction.commit();
	    session.clear();
	    
	    //Contact f= (Contact) session.get(Contact.class, new Integer(2));
	    //System.out.println(f.getEmail());
	    
	    Friends ff= (Friends) session.get(Friends.class, new Integer(2));
	   System.out.println(ff.getEmail());
	    session.close();
	    sessionFactory.close();
	}

}
