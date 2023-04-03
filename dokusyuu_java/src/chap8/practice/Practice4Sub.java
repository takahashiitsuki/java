package chap8.practice;

public class Practice4Sub extends Practice4{
	@Override
	public String show() {
		return String("[%s]",super.show());
	}
}
