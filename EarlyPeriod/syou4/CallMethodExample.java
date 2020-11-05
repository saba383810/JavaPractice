package syou4;

public class CallMethodExample {
	
	public static void countdown(int start) {
		System.out.println("カウントダウンをします");
		for (int i = start; i >= 0; i--) {
			System.out.println(i);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}

	public static void main(String[] args) {
		countdown(10);
	}


}