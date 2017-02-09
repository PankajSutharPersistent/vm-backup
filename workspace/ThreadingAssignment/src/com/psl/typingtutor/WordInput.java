package com.psl.typingtutor;

import java.util.Scanner;

public class WordInput extends Thread{
	
	BeanClass word;
	
	public void run()
	{
		System.out.println("Typer Here");

		//Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		
		while(true)
		{
			Long strt=System.currentTimeMillis();
			Scanner sc1=new Scanner(System.in);
			Long end=System.currentTimeMillis();
			String s1=sc1.nextLine();
			System.out.println(end-strt);
	         if(s1.equals(word.dd))
	         {
	        	 word.hit++;
	        	 word.wordGenerated++;
	        	WordDropper wd=new WordDropper();
	        	wd.start();
	         }
	         else if(s1.equals("*"))
	         {
	        	 word.wordGenerated++;
	        	 System.out.println("Your result is==>"+(word.hit/word.wordGenerated)*100 +"%");
	        	 break;
	         }
	         else if (! s1.equals(word.dd) || (end-strt)<5000)
	         {
	        	 word.wordGenerated++;
	        	 System.out.println("Your ww result is==>"+(word.hit/word.wordGenerated)*100 +"%");

			      break;	
			}
	         
	         
		}
	}

}
