import java.util.Scanner;

public class CheckingArray {
	static int findPosition(int num,int[] nos)
	{
		int position = -1;
		for(int i=0;i<nos.length;i++)
		{
			
			if(num==nos[i])
			{
				position =i;
			}
		}
		
		return position;
		
	}
	
	
	
	public static void main(String[] args)
	{
		int list[]={10,9,8,7,6,5,4,3,2,1};
		int num = 0;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		num = reader.nextInt();
		System.out.println(findPosition(num, list));
		
	}

}
