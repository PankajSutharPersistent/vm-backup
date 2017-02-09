package com.psl.geometricalshape;

public abstract class ShapeDemo {
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
	public abstract void calculateVolume();
	public abstract void calculateSurfaceaArea();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(10, 5);
		rectangle.calculateArea();
		rectangle.calculatePerimeter();
		
		Circle circle=new Circle(10);
		circle.calculateArea();
		circle.calculatePerimeter();
		
		Triangle triangle=new Triangle(10, 5, 6);
		triangle.calculateArea();
		triangle.calculatePerimeter();
		
		Cube cube=new Cube(5);
		cube.calculateSurfaceaArea();
		cube.calculateVolume();
		
		Sphere sphere=new Sphere(10);
		sphere.calculateVolume();
		sphere.calculateSurfaceaArea();
		
		Pyramid pyramid=new Pyramid(10, 10, 20);
		pyramid.calculateSurfaceaArea();
		pyramid.calculateVolume();
		
		

	}

}
