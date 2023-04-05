package chap8.practice;

public class Hamster implements IAnimal {
	private String name;
	
	public Hamster(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.printf("%s は、トコトコ歩きます。",this.name);
	}
}
