package text6;

public class AnnonymousClassExample {
	public static void main(String[] args) {
		Greeting.greet(new SayHello() {
			public void hello() {
				System.out.println("こんにちは");
			}
		});
	}
}
