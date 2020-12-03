package pkg11syou;

import pkg3syou.Souko;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//リスト作成
		List<String> list = Arrays.asList("January","February","March", "April", "May", "June","July", 
				"August", "September", "October", "November","December");
		
		//ストリーム作成
		Stream<String> stream = list.stream();


		//終端操作forEachメソッド
		list.stream().forEach(s -> System.out.println(s));
		
		
		//終端操作のcountメソッドを使う
		System.out.println(list.stream().count());
		
		
		//例えば、文字列の長さが７上の、文字列が何個あるかを調べたいfilterメソッド（中間操作）
		System.out.println(list.stream().filter(s -> s.length()>=7).count());
		
		//別なオブジェクトを作り（mapメソッド中間操作）【】をつけたい→終端処理forEachメソッドでprintする
		list.stream().map(s -> "["+s+"]").forEach(s -> System.out.println(s));


		System.out.println();

		
		//長さが５以下の文字列だけをabc順で並び替え、【】をつけてprint（教科書そのまま）
		//list.stream()からの・・・・

		list.stream().filter(s -> s.length() <=5).map(s -> "["+s+"]").sorted().forEach(s -> System.out.println(s));
		System.out.println();
		
		//長さが５以下の文字列だけを長さ順で並び替え、【】をつけてprint（応用）
		list.stream().filter(s -> s.length() <=5).map(s -> "["+s+"]").sorted((s0,s1)->s0.length()-s1.length()).forEach(s -> System.out.println(s));
		System.out.println();
		
	}

}
