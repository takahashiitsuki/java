package chap4;

public class Practice2 {
	public static void main(String[] args) {
	    int i = 0;
	    int sum = 0;

	    while (i <= 100) {
	      sum += i;
	      if (sum > 1000) {
	        break;
	      }
	      i++;
	    }

	    System.out.println("合計が1000を超えるのは、1～" + i + "を加算したときです。");
	  }
}
