package chap5;

import java.time.LocalDateTime;

public class Practice3_1 {
	public static void main(String[] args) {
		var time = LocalDateTime.now();
		System.out.println(time.getMonthValue() + "月　" + time.getMinute() + "分");
	}
}
