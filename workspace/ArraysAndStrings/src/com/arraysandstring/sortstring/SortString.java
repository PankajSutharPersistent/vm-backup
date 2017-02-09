package com.arraysandstring.sortstring;

public class SortString {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="my Name is pankaj suthar";
		String[] tempresult=inputString.split(" ");
		/*Arrays.sort(tempresult);
		for(String s:tempresult)
		{
			System.out.println(s);
		}*/
		for(int i=0;i<tempresult.length;i++)
		{
			for(int j=i+1;j<tempresult.length;j++)
			{
				if(tempresult[i].compareToIgnoreCase(tempresult[j])>0)
				{
					String temp=tempresult[j];
					tempresult[j]=tempresult[i];
					tempresult[i]=temp;
							
				}
				
			}
			
		}
		String result="";
		
		for(String s:tempresult)
		{
			result=result+" "+s;
			
		}
		result=result.trim();
		System.out.println(result);
		
}
}
