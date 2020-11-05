package syou4;

public class ArgmentsExample {
	public static void main(String[] args) {
		System.out.println("引数で渡された配列の要素数" + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			
		}
	}
}