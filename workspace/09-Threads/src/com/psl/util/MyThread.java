package com.psl.util;

public class MyThread extends Thread{
	
	public MyThread(String name)
	{
		
		
		
		super(name);
	}
	
	
	
	@Override
	public void run() {
	
		for(int x=0;x<10;x++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(String.format("%5d %s", x,getName()));
			
		}
	}
}
