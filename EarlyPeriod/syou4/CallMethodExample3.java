package syou4;

public class CallMethodExample3 {
	public static void methodA() {
		System.out.println("methodAが呼び出されました");
		System.out.println("methodBを呼び出します");
		methodB();
		System.out.println("methodBの呼び出しが終わりました");
	}

	public static void methodB() {
		System.out.println("methodBが呼び出されました");
	}

	public static void main(String[] args) {
		System.out.println("methodAを呼び出します");
		methodA();
		System.out.println("methodAの呼び出しが終わりました");
	}
}