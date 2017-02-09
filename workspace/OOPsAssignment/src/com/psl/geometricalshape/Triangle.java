package com.psl.geometricalshape;

public class Triangle extends ShapeDemo{

	private int l,b,h;
	
	
	
	public Triangle(int l, int b, int h) {
		super();
		this.l = l;
		this.b = b;
		this.h = h;
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

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle is="+(0.5*b*h));
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of trinagle is="+(l+b+h));
		
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
