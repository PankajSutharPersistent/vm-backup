package com.psl.util;

import com.psl.sync.SharedResource;

public class RunCounter extends Thread {
	
	private SharedResource sharedResource;
	
	public RunCounter(SharedResource s){
	this.sharedResource=s;
		
		
	}
	
	public void run(){
		
		sharedResource.decrementCounter();
	}

}
