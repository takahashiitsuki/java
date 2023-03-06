package chap5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Practice3_2 {
	public static void main(String[] args) {
		var time = LocalDateTime.now();
		time = time.plus(20, ChronoUnit.DAYS);
		System.out.println(time.getDayOfMonth());
	}
}
