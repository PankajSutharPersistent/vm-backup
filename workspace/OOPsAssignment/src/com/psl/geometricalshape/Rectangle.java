package com.psl.geometricalshape;

public class Rectangle extends ShapeDemo{
	
	
	private int l,b;
	

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
		
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Rectangle="+(l*b));
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Rectangle is="+(2*(l+b)));
		
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
