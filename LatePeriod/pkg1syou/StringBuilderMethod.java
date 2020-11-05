package pkg1syou;

import java.util.Scanner;

//文字列StringBuilderクラス・・・可変の文字列操作
//教科書にはないので、公式マニュアル
//https://docs.oracle.com/javase/jp/8/docs/api/java/lang/StringBuilder.html
//などで確認

//キーボードから入力した文字をつなげていく
class StringBuilderMethod{
	public static void main ( String[] args ){

		String inputString;
		StringBuilder outString = new StringBuilder("");
		Scanner sc = new Scanner(System.in);
		System.out.print("string->");
		inputString = sc.next();
		while(!inputString.equals("quit")) {
	
			outString.append(inputString);
			System.out.print("next->");
			inputString = sc.next();
		}
		if(!outString.toString().equals(""))
			System.out.println("作成した文字列は→"+outString);
		else
			System.out.println("何もありません");
	}
}