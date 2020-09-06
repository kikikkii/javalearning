package faceToObject;

public class Circle {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle() {
		super();
		this.radius = 1;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
}
