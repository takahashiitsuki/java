package chap4;

public class Practice3 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 100; i <= 200; i++) {
			if(i / 2 == 0) {
				continue;
			}
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
