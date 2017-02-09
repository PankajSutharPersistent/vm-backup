package com.psl.client;

import java.io.Serializable;

public class Engine implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2844735913906184483L;
	private int cubicCapacity;
	private FuelType fuelType;
	private double horsePower;
	public int getCubicCapacity() {
		return cubicCapacity;
	}
	public void setCubicCapacity(int cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}
	public FuelType getFuelType() {
		return fuelType;
	}
	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public Engine(int cubicCapacity, FuelType fuelType, double horsePower) {
		super();
		this.cubicCapacity = cubicCapacity;
		this.fuelType = fuelType;
		this.horsePower = horsePower;
	}
	public Engine() {
		super();
	}
	

}
