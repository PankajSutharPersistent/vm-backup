package com.psl.util;

import com.psl.sync.SharedResource;
 
class Client {
	public static void main(String args[])
	{
	
		SharedResource s=new SharedResource(20000000000l);
		RunCounter rc=new RunCounter(s);
		ReadCounter rcc=new ReadCounter(s);
		rc.start();
		rcc.start();
		
		
	}

}
