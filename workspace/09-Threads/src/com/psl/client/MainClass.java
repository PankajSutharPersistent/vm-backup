package com.psl.client;

public class MainClass {
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}	
			
			
		System.out.println("End");
		
		
		
		
		
		
	}

}
