package com.cogzy.model;

public class Rectangle extends Shape {

	private double width;
	private double breadth;

	Rectangle() {

	}

	public Rectangle(double width, double breadth) {
		super();
		this.width = width;
		this.breadth = breadth;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public void printArea() {
		double area = width * breadth;
		System.out.printf("Area of Rectangle with width = %.2f and breadth = %.2f is %.2f\n", width, breadth, area);
	}
}
