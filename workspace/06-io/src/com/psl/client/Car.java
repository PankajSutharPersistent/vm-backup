package com.psl.client;

import java.io.Serializable;

public class Car implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7810008300848992471L;
	/*data members*/
	private String make,model,color;
	private Engine engine;
	/*getters/setters
	 * member method
	 * instance method
	 * Getter is known as ACCESOR
	 * setter is known as mutators
	 * */
	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public Car()
	{
		make=model=color="";
	}

	
	public String getMake() {
		return make;
	}

	public Car(String make, String model, String color) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
	}


	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}
     
	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString(){
		return String.format("%s --%s --%s", getMake(),getModel(),getColor());
	}

}
