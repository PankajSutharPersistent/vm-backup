package com.psl.geometricalshape;

public class Sphere extends ShapeDemo{
	
	private int radius;
	

	public Sphere(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateVolume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Sphere is="+((4/3)*3.14*radius*radius*radius));
		
	}

	@Override
	public void calculateSurfaceaArea() {
		// TODO Auto-generated method stub
		System.out.println("Surface Area of Sphere="+(4*3.14*radius*radius));
		
	}

}
