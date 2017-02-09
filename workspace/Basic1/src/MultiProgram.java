import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.DateFormatter;


public class MultiProgram {
	

	static boolean isLeapYear(int year)
	{
		if((year%400==0)||(year%4==0)&&(year%100!=0))
		{
			return true;
		}
		else
		{
		return false;
		}
		
	}
	static String isOddOrEven(int number)
	{
		String s=null;
		if(number%2==0)
		{ s="even";}
	
		else {s="odd";}
		
		return s;
	}
	static int findFactorial(int num)
	{
		int fact=1;
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
		
	}
	static boolean isNoPrime(int num)
	{
		int flag=0;
		for(int j=2;j<num;j++)
		{
			if(num%j==0)
			{
				flag=0;
				break;
			}
			else
			{flag=1;}
		}
		if(flag==1){return true;}
		else{return false;}
		
	}
	static boolean dateChecker(String inputDate)
	{
		Date date=null;
		int flag=0;
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		formatter.setLenient(false);
		try {
			date=formatter.parse(inputDate);
			flag=0;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			flag=1;
			e.printStackTrace();
		
		}
		if(flag==1){return false;}
		else{return true;}
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=20024;
		System.out.println(year+" is leap year ? "+isLeapYear(year));
		int number=4;
		System.out.println(number+" is a "+isOddOrEven(number)+" number");
		int x=4,n=10;
		System.out.println(Math.pow(x, n));
		int numberForfactorial=5;
		System.out.println("Factorial of "+numberForfactorial+" is "+findFactorial(numberForfactorial));
		int numbForPrime=19;
		System.out.println(numbForPrime+" is a prime number? "+isNoPrime(numbForPrime));
		String date="1993-32-12";
		System.out.println(date+" is a valid date ? "+ dateChecker(date));
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		Scanner sc=new Scanner(System.in);
		
		
	}

}
