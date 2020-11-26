package pkg6syou;

class Inner2 {
	void print(String message) {
		System.out.println("Inner2クラスのprintメソッドが呼ばれました");
		System.out.println(message);
	}
}
class Outer2 {
	private String message = "Outer2クラスのprivateなインスタンス変数です";

	void doSomething() {

		Inner2 inner = new Inner2();
		inner.print(message);
	}
}

public class InnerClassExamplePre {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.doSomething();
	}
}
