
public class Chapter08 {
	public static void main(String[] args) {
		int w = 1;
		System.out.println("while文");
		while (w < 5) {
			System.out.println(w*w);
			w++;
		}
		int[] array = {1, 2, 3, 4};
		System.out.println("for文");
		for (int f1 = 0; f1 < array.length; f1++) {
			System.out.println(array[f1]);
		}
		System.out.println("拡張for文");
		for (int f2 : array) {
			if (f2 % 2 == 0) {
				continue;
			}
			System.out.println(f2);
		}
	}
}
