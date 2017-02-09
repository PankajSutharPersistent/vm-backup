package com.psl.sync;

public class SharedResource {
	private long number;
	
	public SharedResource(Long number){
		
		this.number=number;
	}
	
	
	public void decrementCounter(){
		
		while(number>0)
		{
			number--;
		}
		}
	public long readCounter() {
		return number;
		
	}

}
