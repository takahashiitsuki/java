package chap11;

public class Practice4 {
	public static void main(String args[]) {
		.supplyAsync(() ->{
			var r = new Random();
			var num = r.nextInt(2000);
			heavy(num);
			System.out.printf("処理1: %d\n",num);
			return num;
		})
		
		.({
			var num = data*2;
			heavy(num);
			System.out.printf("処理2:%d\n", num);
			return num;
		})
		
		.({
			var num = data * 2;
			heavy(num);
			System.out.printf("処理3: %d\n", num);
		});
	}
}
