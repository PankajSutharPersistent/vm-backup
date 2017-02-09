package com.psl.hailstone;

import java.util.Scanner;

public class HailStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the no from which you want to start hailstone series?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String start=""+n;
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
			}
			else
			{
				n=3*n+1;
			}
			
			start=start+" "+n;
		}
		System.out.println(start.trim());
	}

}
