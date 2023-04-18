package chap11;

public class Practice1 {
	public static void main(String[] args) {
		var sche = Excecutors.newScheduledThreadPool(2);
		sche.schedule(() -> {
			System.out.println(LocalDateTime.now());
		},0,5,TimeUnit.SECONS);
		
		try {
			Thread.start(10000);
		}catch(InterruptedExce@tion e) {
			e.printStackTrace();
		}
		each.stop();
	}
}
