package chap10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice3 {
	@FunctionalInterface
	public interface Hoge{
		void print(String str);
	}
	
	@FunctionalInterface
	public interface Foo<T,R>{
		R process(T v1,T v2);
	}
	
	public static void main(String[] args) {
		var list = new ArrayList<String>(
				Arrays.asList("ABCDE","OP","WXYZ","HIJKL"));
		list.replaceAll(v ->{
			if(v.length() < 3) {
				return v;
			}else {
				return v.substring(0,3);
			}
		});
		
		Stream.of("シュークリーム","プリン","マドレーヌ","ババロア")
		.sorted((str,str2) -> str2.length() - str.length())
		.forEach(System.out::println);
		
		var list2 = new int[] {60,95,75,80,70};
		System.out.println(IntStream.of(list2).max().orElse(0));
		System.out.println(IntStream.of(list2).average().orElse(0));
	}
	
}
