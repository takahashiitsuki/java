package chap5;

public class Practice2_2 {
	public static void main(String[] args) {
		String str = "お問い合わせはsupport@example.comまで";
		System.out.println(str.replaceAll("[a-z0-9.!#$%&`*+/=?^_{|}~-]+@[a-z0-9-]+(?:\\.[a-z0-9-]+)*", "<a href=\"malito:$0\">$0</a>"));
	}
}
