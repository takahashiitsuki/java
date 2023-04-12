package chap10;

import java.util.ArrayList;
import java.util.Arrays;

public class PCollRemove {
	public static void main() {
	var list = new ArrayList<String>(
		Arrays.asList("シュークリーム", "エクレア", "マドレーヌ", "ババロア"));
	list.removeIf(v -> v.length() < 5);
	System.out.println(list);
	}
}
