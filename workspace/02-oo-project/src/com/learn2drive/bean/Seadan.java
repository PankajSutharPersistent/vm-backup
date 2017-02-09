package com.learn2drive.bean;

public class Seadan extends Car {
	
	private boolean convertible;
	
	

	public Seadan() {
		super();
	}

	public Seadan(String make, String model, String color, boolean convertible) {
		super(make, model, color);
		this.convertible = convertible;
	}

	public boolean isConvertible() {
		return convertible;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	

}
