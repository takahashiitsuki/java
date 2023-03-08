package chap5;

public class Practice1 {
	public static void main(String[] args) {
		var str = "となりのきゃくはよくかきくうきゃくだ";
		System.out.println(str.lastIndexOf("きゃく"));
		var area = "千葉";
		var temp = 17.256;
		System.out.println(String.format("%sの気温は、%.2fです。", area, temp));
	}
}
