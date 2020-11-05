package syou4;

public class OverloadExample {
	
	public static void methodA() {
		System.out.println("引数はありません");
	}

	public static void methodA(int i) {
		System.out.println("int型の値を受け取りました");
	}


	public static void main(String[] args) {
		methodA();
		methodA(1);
		//methodA(0.1);		//対応するメソッドを作成して、先頭コメントを外しましょう
		//methodA("Hello");	//対応するメソッドを作成して、先頭コメントを外しましょう
	}
}