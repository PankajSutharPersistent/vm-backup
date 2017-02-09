package com.psl.client;

import java.sql.Date;
import java.util.*;


class x{}
class y extends x{}
class z extends y{}

class gen<T>
{
	public void add(T val){}
	public T get(){return null;}
}


public class Main {
	public static void main(String [] args)

	{
		gen<? extends x> ref;
		ref=new gen<x>();
		
		
		
		
		
		
		
		
		
		
		//List<Person> persons=new ArrayList<Person>();
		//<Person> persons=new TreeSet<Person>(new PersonIterface());
		Map<Adhar, Person> persons=new HashMap<Adhar, Person>();
		
		persons.put(new Adhar("123456", "654123"), new Person("Rahual", "Suthar", Date.valueOf("1993-09-16")));
		
		
		persons.put(new Adhar("134679", "653123"), new Person("pankaj", "Suthar", Date.valueOf("1993-07-16")));

		persons.put(new Adhar("852963", "654133"), new Person("Dinesh", "Suthar", Date.valueOf("1993-01-16")));
		
		Person p=persons.get(new Adhar("123456", "654123"));
		System.out.println(p.getFname());
		NumberContainer<Long> r1;
		r1=new NumberContainer<Long>();
		
		NumberContainer<Long> r2;
		r2=new NumberContainer<Long>();
		r1.hasSameAverage(r2);
		
	}
}
