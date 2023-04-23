package chap11;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class A {
	public static void main(String[] args) {
		var exe = Executors.defaultThreadFactory();
		
		var r = exe.submit({
			var rnd = new();
			var num = rnd.nextInt(1000);
			Thread.(num);
			return num;
		});
		
		System.out.println("結果：" + r.());
	}
}
