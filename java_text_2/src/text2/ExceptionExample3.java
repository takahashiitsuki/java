package text2;

public class ExceptionExample3 {
	public static void main(String[] args) {
		int a = 4;
		int b =0;
		try {
			int c = a / b;
			System.out.println("cの値は" + c);
		}
		catch(ArithmeticException e) {
			System.out.println("例外をキャッチしました");
			//例外の内容を出力
			System.out.println(e);
		}
		System.out.println("プログラムを終了します");
	}
}
