package practice2;

public class Practice2_3 {
	public static void main(String[] args) {
		try {
			System.out.println("処理が正常に行われました");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外処理A");
		}
		catch(Exception e) {
			System.out.println("例外処理B");
		}
		
		System.out.println("プログラムを終了します");
	}
}
