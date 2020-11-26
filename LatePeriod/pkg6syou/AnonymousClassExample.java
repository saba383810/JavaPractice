package pkg6syou;

public class AnonymousClassExample {
	
	public static void main(String[] args) {
		
		Greeting.greet(new SayHello() {
			@Override
			public void hello() {
				System.out.println("Hello");
			}
		});
		Greeting.greet(()->{
			System.out.println("hello");
		});
	}
}