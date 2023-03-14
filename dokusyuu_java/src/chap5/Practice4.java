package chap5;

import java.util.Arrays;

public class Practice4 {
	public static void main(String[] args) {
		System.out.println("①" + Math.pow(6, 3));
		System.out.println("②" + Math.abs(-15));
		var array = new int[] {110, 14, 28, 32};
		Arrays.sort(array);
		System.out.println("③" + Arrays.toString(array));
	}
}
