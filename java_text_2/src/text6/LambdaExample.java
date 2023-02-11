package text6;

interface SimpleInterface{
	public int doSomething(int n);
}

public class LambdaExample {
	static void prinout(SimpleInterface i) {
		System.out.println(i.doSomething(2));
	}
	
	public static void main(String[] args) {
		printout(n -> n + 1);
	}
}
