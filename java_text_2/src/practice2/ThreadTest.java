package practice2;

class SimpleThread implements Runnable{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		SimpleThread st = new SimpleThread();
		Thread thread = new Thread(st);
		// Thread t = new THread(new SimpleThread());
		thread.start();
	}
}
