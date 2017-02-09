package com.psl.entity;

public class Shape {
	private String name;
	private int area,perimeter;
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}

}
