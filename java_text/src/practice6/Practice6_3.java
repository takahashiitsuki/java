package practice6;

class Rectangle	{
	double width;
	double height;
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		return this.width * this.height;
	}
	
	boolean isLarger(Rectangle r) {
		double thisArea = this.getArea();
		double rArea = r.getArea();
		return thisArea > rArea;
	}
}

public class Practice6_3 {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(10.0, 20.0);
		System.out.println("aの面積は" + a.getArea());
		Rectangle b = new Rectangle(5.0, 10.0);
		System.out.println(a.isLarger(b));
	}
}
