package chap6;

import java.util.ArrayList;
import java.util.Arrays;

public class PList {
	public static void main (String[] args) {
		var list = new<Integer>ArrayList (Arrays.asList(10,15,30));
		var list2 = new<Integer>ArrayList (Arrays.asList(60,90));
		list.remove(0);
		list.set(1, 20);
		list.addAll(2,list2);
		for(var i:list) {
			System.out.println(i);
		}
	}
}
