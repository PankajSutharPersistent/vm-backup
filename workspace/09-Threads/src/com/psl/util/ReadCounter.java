package com.psl.util;

import com.psl.sync.SharedResource;

public class ReadCounter extends Thread {

	private SharedResource sharedResource;
	public ReadCounter(SharedResource s){
		
	this.sharedResource=s;
	}
	
	public void run(){
		
		System.out.println(sharedResource.readCounter());
		
		
	}
	
}
