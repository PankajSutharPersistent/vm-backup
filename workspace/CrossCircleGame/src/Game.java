import java.util.Scanner;


public class Game {
	
	static String checkWinner(int[][] game)
	{
		String winner="Drawn";
		int sumd1=0,suml=0,sumd2=0,sumv=0;
		int t1=0,t2=2;
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				suml=suml+game[i][j];
				sumv=sumv+game[j][i];
				sumd1=sumd1+game[j][j];
				sumd2=sumd2+game[t1][t2];
				t1++;
				t2--;
			}
			System.out.println(sumd1+" "+sumd2+" "+suml+" "+sumv);
			if(((sumd1==0)||(sumd2==0)||(suml==0)||(sumv==0)) & ((sumd1==3)||(sumd2==3)||(suml==3)||(sumv==3)))
			{
				System.out.println("M here");
				winner="drawn";
				break;
			}
			
			if((sumd1==0)||(sumd2==0)||(suml==0)||(sumv==0))
			{
				winner="Player1";
				break;
			}
			if((sumd1==3)||(sumd2==3)||(suml==3)||(sumv==3))
			{
				winner="Player2";
				break;
			}
			
			
			
		
		}
		
		
		
		
		
		
		
		return winner;
	}

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int game[][]=new int[3][3];
		int chance=9;
		int i,j;
		String winner=null;
		Scanner sc=new Scanner(System.in);
		while(chance>0)
		{
			 
			System.out.println("First Player enter your choice ?");
			int choice1=sc.nextInt();
			i=choice1/3;
			j=choice1%3;
			game[i][j]=0;
			chance--;
			
			if(chance>0)
			{
			System.out.println("Second Player enter your choice ?");
			int choice=sc.nextInt();
			i=choice/3;
			j=choice%3;
			game[i][j]=1;
			chance--;
			}
			
			
			
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(game[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("Winner of Game is : "+checkWinner(game));
		
		
		
		
		
		
	}

}

