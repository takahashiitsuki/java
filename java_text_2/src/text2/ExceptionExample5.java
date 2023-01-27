package text2;
class SimpleClass2{
	void doSomething() {
		int array[] = new int[3];
		array[10] = 99;
		System.out.println("doSomethingメソッドを終了します");
	}
}

public class ExceptionExample5 {
	public static void main(String[] args) {
		SimpleClass2 obj = new SimpleClass2();
		try {
			obj.doSomething();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("例外をキャッチしました");
			e.printStackTrace();
		}
	}
}
