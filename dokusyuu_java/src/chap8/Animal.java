package chap8;

public class Animal {
	public String name;
	public int age;
	
	//コンストラクタ―
	public Animal() {
		super("名無権兵衛",0);
	}
	
	public Animal(String name, int age) {
		name = name;
		age = age;
	}
	
	//アクセサリーメソッド
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}
	
	//メソッド
	public String intro() {
		return String.format("私の名前は$s。$d歳です.", getName(),
				getAge());
	}
}
