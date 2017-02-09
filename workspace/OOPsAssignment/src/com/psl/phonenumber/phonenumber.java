package com.psl.phonenumber;

public class phonenumber {
	private int areacode;
	private int exchange;
	private int extension;
	
	

	public phonenumber(int areacode, int exchange, int extension) {
		super();
		this.areacode = areacode;
		this.exchange = exchange;
		this.extension = extension;
	}



	public int getAreacode() {
		return areacode;
	}



	public void setAreacode(int areacode) {
		this.areacode = areacode;
	}



	public int getExchange() {
		return exchange;
	}



	public void setExchange(int exchange) {
		this.exchange = exchange;
	}



	public int getExtension() {
		return extension;
	}



	public void setExtension(int extension) {
		this.extension = extension;
	}
	
	@Override
	public String toString()
	{
		
		return String.format("(%s) %s-%s", getAreacode(),getExchange(),getExtension());
		
	}
	
	static boolean equalCheck(phonenumber first,phonenumber second)
	{
		if(first.toString().equalsIgnoreCase(second.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		phonenumber firstContact=new phonenumber(900, 867, 5309);
		System.out.println(firstContact);
		phonenumber secondcontact=new phonenumber(800, 867, 5309);
		System.out.println(equalCheck(firstContact, secondcontact));
		
	}

}
