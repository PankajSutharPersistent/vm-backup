package com.psl.treeset;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student rhs) {
		int var;
		if(getAge()>rhs.getAge())
		{
			var=1;
		}
		else
		{
			if(getAge()<rhs.getAge())
			{
				var=-1;
			}
			else
			{var=0;}
		}
		return var;
	}
	
	

}
