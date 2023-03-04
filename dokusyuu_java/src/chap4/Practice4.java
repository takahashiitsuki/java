package chap4;

public class Practice4 {
	public static void main(String[] args) {
		String language = "Scala";
		switch(language) {
		case "Scala","Lotlin","Groovy":
			System.out.println("JVM言語");
		break;
		case "C#","Visual Basic","F#":
			System.out.println(".NET言語");
		break;
		default:
			System.out.println("不明");
		}
	}
}
