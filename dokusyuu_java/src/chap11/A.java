package chap11;

import java.util.Random;
import java.util.concurrent.Executors;

public class A {
	public static void main(String[] args) {
		var exe = Executors.newSingleThreadExecutor();
		
		var r = exe.submit(() -> {
			var rnd = new Random();
			var num = rnd.nextInt(1000);
			Thread.sleep(num);
			return num;
		});
		
		System.out.println("結果：" + r.get());
	}
}
