package com.psl.ternaryoperator;

public class TerneryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest;
		int a=101,b=20,c=30;
		
		largest=((a>b & a>c) ? a:((b>c)? b :c ));
		System.out.println("Largest no is :"+largest);

	}

}
