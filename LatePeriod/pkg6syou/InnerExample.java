package pkg6syou;

public class InnerExample {
	
	public static void main(String[] args) {
		
		class Person implements SayHello {
			public void hello() {
				System.out.println("こんにちは");
			}
		}
		Person p = new Person();
		Greeting.greet(p);
		

		
	}
}