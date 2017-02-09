package com.psl.treeset;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeSet<Student> students=new TreeSet<Student>(new StudentComparator());
		TreeSet<Student> students1=new TreeSet<Student>();

		Student s1=new Student("Pankaj", 23);
		Student s2=new Student("Niel", 29);
		Student s3=new Student("Ashish", 35);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students1.add(s1);
		students1.add(s2);
		students1.add(s3);
		
		for(Student s : students)
		{
			System.out.println(s.getName());
		}
		System.out.println();
		for(Student s : students1)
		{
			System.out.println(s.getName());
		}
	}

}
