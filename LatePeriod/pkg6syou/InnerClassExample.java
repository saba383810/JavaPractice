package pkg6syou;

//内部クラス・・・クラスの中にクラスを作る

//Outerクラス
class Outer {
	private String message = "Outerクラスのprivateなインスタンス変数です";

	void doSomething() {
		
		//Innerクラス（Outerクラス内に作成している）
		class Inner {
			void print() {
				System.out.println("Innerクラスのprintメソッドが呼ばれました");
				System.out.println(message);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}
}

public class InnerClassExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.doSomething();




	}

}