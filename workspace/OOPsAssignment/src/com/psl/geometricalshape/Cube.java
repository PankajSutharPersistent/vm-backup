package com.psl.geometricalshape;

public class Cube extends ShapeDemo{
	
	private int side;
	

	public Cube(int side) {
		super();
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
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
		System.out.println("Volume of Cube="+(side*side*side));
		
	}

	@Override
	public void calculateSurfaceaArea() {
		// TODO Auto-generated method stub
		System.out.println("Surface Are of Cube is="+(6*side*side));
		
	}

}
