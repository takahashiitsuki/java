package chap8;

public interface IFather {
	default void run() {
		System.out.println("I am a father.");
	}
}
