package com.psl.hangmangame;

import java.util.Scanner;

public class HangmanGame {
	static int count=0;
	static String takeinput()
	{
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}
	static int generateChoice()
	{
		int []randm=new int[10];
		int i= (int)(Math.random() * (122 - 97) + 97);
		
		for(int j=0;j<randm.length;j++)
		{
			if(randm[j]==i)
			{
				
				generateChoice();
			}
		}
		randm[count]=i;
		count++;
		return i;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the word to start the game ? ");
		Scanner sc=new Scanner(System.in);
		String wordQuestin=sc.nextLine();
		String []game=new String[wordQuestin.length()];
		int []chancesCount=new int[10];
		for(int i=0;i<wordQuestin.length();i++)
		{
			game[i]="_";
		}
		System.out.println("PC's Chance, Only get 5 chance");

		int chance=10;
		while(chance!=0)
		{
			System.out.println("Pc guessing letter....");
			Thread.sleep(1000);
			int asciiLetter = generateChoice(); 
			
			char c=(char) asciiLetter;
			System.out.println(c);
			System.out.println("If the correct word is guessed by Pc type y else n");
			String judge=takeinput();
			if(judge.equals("y"))
			{
				judge="";
				System.out.println("At how many place pc guess the letter correct");
				int noOFletterGuessCorrect=sc.nextInt();
				for(int i=0;i<noOFletterGuessCorrect;i++)
				{
					System.out.println("Enter the index or place");
					game[sc.nextInt()]=""+c;
				}
				for(int i=0;i<game.length;i++)
				{
					System.out.println(game[i]);
				}
				
			}
			
			chance--;
			
			
			
			
			
			
			
		}
		for(int i=0;i<game.length;i++)
		{
			if(game[i].equals("_"))
			{
				System.out.println("You Loose the game.Try Agian");
				break;
			}
			
			
		}
	}

}
