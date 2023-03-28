package chap7;

public class PCalculation {
	public static double getAverage(double... values) {
		var result = 0.0;
		for (var value : values) {
			result += value;
		}
		return result / values.length;
	}
}
