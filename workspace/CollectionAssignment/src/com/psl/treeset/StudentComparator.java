package com.psl.treeset;

import java.util.Comparator;



public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student lhs, Student rhs) {

		
		return lhs.getName().compareTo(rhs.getName());
	}

}
