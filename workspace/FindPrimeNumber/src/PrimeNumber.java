import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class PrimeNumber {
	
	static int[] findPrimeNumber(int m,int n)
	{
		int flag=0;
		int size=n-m+1;
		int count=0;
		int arr[]=new int[size];
		String tempResult=null;
		for(int i=m;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{flag=1;}
			}
			if(flag==1)
			{
				arr[count]=i;
				count++;
			
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("You have to find prime numbers between which two numbers? ");
		int m =reader.nextInt();
		int n=reader.nextInt();
		
		int [] result=findPrimeNumber(m, n);
		


	}

}
