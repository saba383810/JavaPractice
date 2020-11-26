package pkg7syou;
import java.io.*;

public class InputExample {
	public static void main(String[] args) {
		System.out.println("あなたのお名前は？ ");
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);



		try {
			String name = reader.readLine();
			System.out.println("こんにちは。" + name + "さん");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
