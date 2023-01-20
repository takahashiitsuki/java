package practice5;

class Person{
	String name;
	int age;
}

public class Practice5_2 {
	
	static void printInfo(Person p){
		System.out.println(p.name + "　" + p.age + "歳");
	}
	
	static boolean ageCheck(Person p, int i) {
		return p.age > i;
	}
	
	public static void main(String[] args) {
		Person a = new Person();
		a.name = "高橋太郎";
		a.age = 19;
		Person b = new Person();
		b.name = "小林花子";
		b.age = 18;
		printInfo(a);
		boolean agecheck = ageCheck(b, 18);
		System.out.println(agecheck);
	}
}
