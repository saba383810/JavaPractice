package pkg1syou;

import java.util.Random;

class ImportExample {
	public static void main(String[] args) {
		Random rand = new Random();
		// 0 ～ 1の間のランダムな値を出力する
		System.out.println(rand.nextDouble());
		
		//整数値を出力する
		System.out.println(rand.nextInt());
		
		//0-9の間のランダムな整数値を出力する
		System.out.println(rand.nextInt(10));
		
		//1-10にするには？
		
		//１０回連続で試してみよう
		
		//seed（種）？
		
	}
}
