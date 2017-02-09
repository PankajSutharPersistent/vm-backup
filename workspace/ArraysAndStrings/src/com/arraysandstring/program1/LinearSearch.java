package com.arraysandstring.program1;

import java.util.Scanner;

public class LinearSearch {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to search in array?");
		int num=sc.nextInt();
		int arrList[]={9,8,7,6,5,4,3,2,1};
		for(int i=0;i<arrList.length;i++)
		{
			if(num==arrList[i])
			{
				System.out.println("Element "+num+" is present in the list at position "+(i+1));
				break;
			}
		}

	}

}
