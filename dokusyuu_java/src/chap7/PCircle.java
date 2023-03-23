package chap7;

public class PCircle {
	public double radius;
	
	public PCircle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
}
