package com.psl.client;

public enum FuelType {

	PETROL(250),DISE(210);
	
	private int combbustionTemprataure ;
	 
	private FuelType(int cbstemp) {
		// TODO Auto-generated constructor stub
		this.combbustionTemprataure=cbstemp;
	}
	
	public int getcombustionTempratuee(){
		return combbustionTemprataure;
	}
}
