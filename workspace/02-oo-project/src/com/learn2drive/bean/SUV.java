package com.learn2drive.bean;

public class SUV extends Car {
	private boolean fourWheelDrive;
	

	

	public SUV(String make, String model, String color, boolean fourWheelDrive) {
		super(make, model, color);
		this.fourWheelDrive = fourWheelDrive;
	}

	public SUV() {
		super();
	}

	public boolean isFourWheelDrive() {
		return fourWheelDrive;
	}

	public void setFourWheelDrive(boolean fourWheelDrive) {
		this.fourWheelDrive = fourWheelDrive;
	}
	

}
