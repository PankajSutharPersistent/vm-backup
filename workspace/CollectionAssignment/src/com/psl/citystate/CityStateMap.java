package com.psl.citystate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

public class CityStateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> cityState=new HashMap<String, String>();
		int count=5;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any 5 city state pair");
		while(count>0)
		{
			System.out.println("Enter the name of city?");
			String city=sc.nextLine();
			System.out.println("Enter the name of state ?");
			String state=sc.nextLine();
			
			if(cityState.size()==0)
			{
				cityState.put(city, state);
				System.out.println("Value updated");
			}
			else
			{
				if(cityState.containsKey(city))
				{
					cityState.remove(city);
					cityState.put(city, state);
					System.out.println("Value updated after replacing");
				}
				else
				{
					cityState.put(city, state);
					System.out.println("Valueee updated");
				}
				
				
			}
			count--;
		}	
		System.out.println(cityState);
		
	}

}
