package com.psl.typingtutor;

public class BeanClass {
	
	private Dictionary d;
	public static int hit;
	public static int wordGenerated;
	public static Dictionary dd;
	
	public  void generateWord()
	{
		Dictionary[]s=d.values();
		int i=(int) (Math.random()*8);
		dd=s[i];
	}

}
