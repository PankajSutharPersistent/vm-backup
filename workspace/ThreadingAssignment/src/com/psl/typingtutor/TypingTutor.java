package com.psl.typingtutor;

public class TypingTutor extends Thread {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanClass b=new BeanClass();
		
		b.generateWord();
		
		Thread wd=new Thread(new WordDropper());
		Thread wi=new Thread(new WordInput());
		
		
		wd.setPriority(MAX_PRIORITY);
		wi.setPriority(MIN_PRIORITY);
		
		wd.start();
		wi.start();
		

		
		

	}

}
