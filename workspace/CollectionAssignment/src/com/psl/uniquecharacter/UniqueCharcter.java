package com.psl.uniquecharacter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharcter {
	public static void main(String[] args)
	{ 
		String input="Pankaj Suthar Suthar paaaaankkkkkkkajs";
		String[] tempResut=input.split(" ");
		Set<String> result=new HashSet<String>();
		String ss="";
		Map<String, Set<String>> cache=new HashMap<String, Set<String>>();
		
		for(String s:tempResut)
		{
			if(cache.containsKey(s))
			{
				ss=ss+cache.get(s);
				System.out.println(s+" retrived from Cache");
			}
			else
			{
				
				for(int i=0;i<s.length();i++)
				{
				result.add(""+s.charAt(i));
				
				}
				ss=ss+result.toString();
				cache.put(s, result);
				result.clear();
			}
		}
		
		System.out.println(ss);
		
		
	}
	
	

}
