package chap5;

public class Practice1_2 {
	public static void main(String[] args) {
		String str = "鈴木\t太郎\t男\t50歳\t広島県";
		var split = str.split("\t");
		System.out.println(String.join("&", split));
	}
}
