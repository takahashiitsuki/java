package chap4;

public class Practice1_1 {
	public static void main(String[] args) {
		var score = 75;
		if(score >= 90) {
			System.out.println("優");
		}else if(score >= 70) {
			System.out.println("良");
		}else if(score >= 50) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}
}
