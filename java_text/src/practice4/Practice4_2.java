package practice4;

public class Practice4_2 {
	static double getTriangleArea(double height, double base) {
		return height * base / 2.0;
	}
	
	public static void printHello(int count) {
		for(int i = 1; i <= count; i++) {
			System.out.println("Hello World!");
		}
	}
	
	static double getRectangleArea(double width, double height) {
		return width * height;
	}
	
	static String getMessage(String name) {
		String message = ("こんにちは" + name + "さん");
		return message;
	}
	
	static int getAbsoluteValue(int value) {
		if (value < 0) {
			value *= -1;
		}
		return value;
	}
	
	static double getAverage(double a, double b, double c) {
		return (a + b + c) /3;
	}
	
	static boolean isSameAbsoluteValue(int i, int j) {
		i = getAbsoluteValue(i);
		j = getAbsoluteValue(j);
		return i == j;
	}
	
	public static void main(String[] args) {
		double triangleArea = getTriangleArea(10.0, 3.0);
		System.out.println(triangleArea);
		printHello(3);
		double rectangleArea = getRectangleArea(10.0, 3.0);
		System.out.println(rectangleArea);
		String message = getMessage("田中");
		System.out.println(message);
		int absolutevalue = getAbsoluteValue(-1);
		System.out.println(absolutevalue);
		double average = getAverage(1.0, 2.0, 1.5);
		System.out.println(average);
		boolean sameabsolutevalue = isSameAbsoluteValue(1, -2);
		System.out.println(sameabsolutevalue);
	}
}
