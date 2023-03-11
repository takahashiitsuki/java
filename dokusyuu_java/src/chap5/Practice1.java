package chap5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

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
		var day1 = LocalDate.of(2020, 3, 12);
		var day2 = LocalDate.of(2020, 11, 5);
		var period = Period.between(day1, day2);
		System.out.println("⑤ " + period.getMonths() + "ケ月" + period.getDays() + "日間");
	}
}
