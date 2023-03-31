package chap8;

public class Parent extends Person implements IFather,IMother {
	public void run() {
		IFather.super.run(); //IFatherの実装を呼び出し
		IMother.super.run(); //Imotherの実装を呼び出し
	}
}
