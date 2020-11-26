package pkg7syou;
import java.io.*;

public class FileOperationExample {
	public static void main(String[] args) {
		File file = new File("aaa.txt");
		//ファイルがあるかチェック

		if(!file.exists()){
			System.out.println("そんなのない！");
			return;
		}
		
		//そのあとで削除
		if (file.delete()) {
			System.out.println(file + "を削除しました");
		} else {
			System.out.println(file + "を削除できませんでした");
		}
	}
}
