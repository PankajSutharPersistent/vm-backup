package com.psl.client;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Date;

import com.psl.entity.Contact;

public class Client {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		
		Integer i=new Integer(10);
		i=20;
		System.out.println(i);
		

		Contact c=new Contact("Pankaj", "Suthar", Date.valueOf("1993-09-09"));
		Class<?> contactClass=c.getClass();
		Method methods[]=contactClass.getDeclaredMethods();
		

		for(Method m:methods)
		{
			if(m.getName().contains("get"))
			{
				System.out.println(m.invoke(c, null));
			}
			
		}
	}

}
