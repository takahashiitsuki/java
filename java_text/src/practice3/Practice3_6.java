package practice3;

public class Practice3_6 {
	public static void main(String[] args) {
		int[] counts = {1, 3, 5, 6, 5, 2, 8};
		for(int i = 0; i < counts.length; i++) {
			System.out.print(i + ":");
			for(int j = 0; j < counts[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
