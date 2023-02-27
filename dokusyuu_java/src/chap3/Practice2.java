package chap3;

public class Practice2 {
	public static void main(String[] args) {
		var x = 6;
		var y = x;
		y -= 2;
		
		var builder1 = new StringBuilder("いろは");
		var builder2 = builder1;
		builder1.append("にほへと");
		
		System.out.println(builder1 + "\n" + builder2);
	}
}
