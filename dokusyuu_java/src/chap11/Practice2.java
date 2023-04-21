package chap11;

public class Practice2 {
	public static void main(String[] args) {
		var clazz = String.class;
		var con = clazz.getConstructor(String.class);
		var str = con.newInstance("こんにちは、Java！");
		var m = clazz.getMethod("substring", int.class, int.class);
		System.out.println(m.invoke(str, 6, 10));
	}
}
