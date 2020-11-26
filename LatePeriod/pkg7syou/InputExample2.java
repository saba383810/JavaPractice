package pkg7syou;
import java.io.*;
import java.rmi.server.ExportException;

public class InputExample2 {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(in);
		try {
			String line = reader.readLine();
			double val = Double.parseDouble(line);
			System.out.println("入力された値の平方根は" + Math.sqrt(val));
		} catch(IOException e) {
			System.out.println(e);
		}catch (Exception e){

		}
	}
}
