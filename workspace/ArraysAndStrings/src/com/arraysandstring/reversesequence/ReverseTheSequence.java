package com.arraysandstring.reversesequence;

public class ReverseTheSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String para="My name is Pankaj Suthar.I, am Presently .undergoing training process that is ELTP in standard Java.";
		String result="";
		String[] tempResultByDot=para.split("\\.");
		for(String s :tempResultByDot)
		{
		String[] tempResultByComma=s.split(",");
		int count=tempResultByComma.length-1;
			for(String ss:tempResultByComma)
			{
				String[] tempResultBySpace=ss.split(" ");
				for(String sss:tempResultBySpace)
				{
					StringBuilder b=new StringBuilder(sss);
					result=result+" "+b.reverse();
				}
				if(count>0)
				{
					result=result+",";
					count--;
					
				}
				
			}
			
			result=result+".";
		}
		result=result.trim();
		System.out.println(result);
		
	}

}
