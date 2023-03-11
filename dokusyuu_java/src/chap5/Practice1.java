package chap5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Practice1 {
	public static void main(String[] args) {
		var str = "となりのきゃくはよくかきくうきゃくだ";
		System.out.println("① " +str.lastIndexOf("きゃく"));
		var area = "千葉";
		var temp = 17.256;
		System.out.println(String.format("② %sの気温は、%.2fです。", area, temp));
		var name = "彼女の名前は花子です。";
		System.out.println("③ " + name.replace("彼女", "妻"));
		var time = LocalDateTime.now();
		System.out.println("④ " + time.plus(Duration.parse("P5DT6H")));
	}
}
