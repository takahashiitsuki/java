package practice4;

public class Practice4_2 {
	static double getTriangleArea(double height, double base) {
		return height * base / 2.0;
	}
	
	public static void printHello(int count) {
		for(int i = 1; i <= count; i++) {
			System.out.println("Hello");
		}
	}
	
	static double getRectangleArea(double width, double height) {
		return width * height;
	}
	
	public static void main(String[] args) {
		double triangleArea = getTriangleArea(10.0, 3.0);
		System.out.println(triangleArea);
		printHello(3);
		double rectangleArea = getRectangleArea(10.0, 3.0);
		System.out.println(rectangleArea);
	}
}
