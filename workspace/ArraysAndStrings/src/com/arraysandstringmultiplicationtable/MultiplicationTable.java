package com.arraysandstringmultiplicationtable;

public class MultiplicationTable {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String table[][]=new String[13][13];
		for(int i=0;i<13;i++)
		{
			table[i][0]=i+"";
			for(int j=1;j<13;j++)
			{
				
				
				if(i==0)
				{
					table[i][j]=""+1*j;
				}
				else
				{
				table[i][j]=""+i*j;
				}
			}
			
		}
		
		table[0][0]="";
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<13;j++)
			{
				System.out.print(table[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

