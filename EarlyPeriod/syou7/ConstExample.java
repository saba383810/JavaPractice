package syou7;

class A{
	
	A(){
		System.out.println("A:引数なしコンストラクタ");
	}
	A(int x){
		System.out.println("A:引数１つのコンストラクタ");
	}
	
}
class B extends A{
	B(){
		System.out.println("A:引数なしコンストラクタ");
	}
	B(int x){
		System.out.println("A:引数１つのコンストラクタ");
	}
	
}
public class ConstExample {
	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new A(1000);

		B b = new B();
		B b1 = new B(2000);
		
	}
}
