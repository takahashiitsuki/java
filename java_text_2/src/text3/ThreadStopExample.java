package text3;

class MyThread extends Thread{
	public boolean running = true;
	public void run() {
		while(running) {
			System.out.println("*");
		}
		System.out.println("runメソッドを終了します");
	}
}

public class ThreadStopExample {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		try {
			Thread.sleep(5);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		t.running = false;
	}
}
