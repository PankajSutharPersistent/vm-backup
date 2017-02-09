package com.psl.geometricalshape;

public class Pyramid extends ShapeDemo{

	private int height,baseWidth,baseLeangth;
	
	public Pyramid(int height, int baseWidth, int baseLeangth) {
		super();
		this.height = height;
		this.baseWidth = baseWidth;
		this.baseLeangth = baseLeangth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBaseWidth() {
		return baseWidth;
	}

	public void setBaseWidth(int baseWidth) {
		this.baseWidth = baseWidth;
	}

	public int getBaseLeangth() {
		return baseLeangth;
	}

	public void setBaseLeangth(int baseLeangth) {
		this.baseLeangth = baseLeangth;
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
		System.out.println("Volume of Pyramid="+((height*baseLeangth*baseWidth)/3));
		
	}

	@Override
	public void calculateSurfaceaArea() {
		// TODO Auto-generated method stub
		System.out.println("Didnt Calculate"+((baseLeangth*baseWidth)+(baseLeangth*(Math.sqrt((baseWidth/2)*(baseWidth/2)+height*height)))+ (baseWidth*(Math.sqrt((baseLeangth/2)*(baseLeangth/2)+height*height)))));
	}

}
