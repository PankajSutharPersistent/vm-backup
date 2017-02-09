
public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i=i+2)
		{
			for(int j=10-i;j>0;j=j-2)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k=k+2)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		

	} 

}
