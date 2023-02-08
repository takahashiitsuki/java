package practice5;

import java.util.HashSet;
import java.util.Iterator;

public class Practice5_3 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<String>();
		list.add("a");
		Iterator<String> it = list.iterator();
		for(String str : list) {
			System.out.println(str);
		}
	}
}
