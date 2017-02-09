import java.util.Scanner;

public class Client {

	static boolean isPresent(String[] productNames, String keyword)
	{
		int count=0;
		for(int i=0;i<productNames.length;i++)
		{
			if(keyword.equalsIgnoreCase(productNames[i]))
			{
				count++;
			
			}
		}
		if(count>0) {return true;}
		else
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a product: ");
		String productName = reader.nextLine();
		
		Boolean result= isPresent(initProducts.initProductNames(), productName);
		
		System.out.println(result);
	

	}
}
