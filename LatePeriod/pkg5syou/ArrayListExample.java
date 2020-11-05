package pkg5syou;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String[] args) {
		

		//ArrayListを使って、文字列monthsを宣言
		ArrayList<String> months = new ArrayList<String>();

		//いくつかデータ
		months.add("January");
		months.add("Februaly");
		months.add("March");

		//要素数
		System.out.println("要素数 " + months.size());
		
		//データ表示
		System.out.println(months);

		for(int i=0;i<months.size();i++){
			System.out.println(months.get(i));
		}
		for(String hoge : months){
			System.out.println(hoge);
		}
		//要素１を削除
		months.remove(1);
		
		//どうなったか表示
		System.out.println(months);
		

	}
}
