package pkg6syou;

public class SimpleExample {
	
	public static void main(String[] args) {

		Person p = new Person();	//人が登場（インスタンス生成）
		Greeting.greet(p);			//挨拶する（staticメソッド）
	}
}