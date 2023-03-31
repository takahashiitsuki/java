package chap8;

public interface IMother {
	default void run() {
		System.out.println("I am a mother.");
	}
}
