package com.psl.ds1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.ds1.bean.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//spring container
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee e=(Employee) context.getBean("emp");
		
		System.out.println(e.toString());
	}

}
