package com.psl.geometricalshape;

public class Circle extends ShapeDemo {
	private int radius;
	

	public Circle(int radius) {
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
		System.out.println("Area of circle is="+(3.14*radius*radius));
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Circle is="+(2*3.14*radius));
		
	}

	@Override
	public void calculateVolume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calculateSurfaceaArea() {
		// TODO Auto-generated method stub
		
	}

}
