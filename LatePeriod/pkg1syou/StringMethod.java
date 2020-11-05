package pkg1syou;

class StringMethod {

	public static void main(String[] args) {
			
		String str = "ABCDEFG";

		//変数strについて、以下を調べる。
		System.out.printf("チェックする文字列は\"%s\"です\n",str);

		//文字列の長さを取得する
		System.out.print("長さは");
		System.out.println(str.length());
		
		//２番目の文字を取り出す
		System.out.print("２番目の文字は");
		System.out.println(str.charAt(1));
		//同じ文字かどうかチェック
		System.out.print("ABCDEFGと同じ？→");
		System.out.println(str == "ABCDEFG");
		System.out.print("abcdfegと同じ？→");
		System.out.println(str == "abcdefg");
		
		//同じ文字かどうかチェック（大文字小文字区別しない）
		System.out.print("ABCDEFGと同じ？(大小区別なし)→");
		System.out.println(str.equalsIgnoreCase("ABCDEFG"));
		System.out.print("abcdfegと同じ？(大小区別なし)→");
		System.out.println(str.equalsIgnoreCase("abcdefg"));

		
		//Dの文字は何番目に出現するか
		System.out.println("Dは"+(Integer.valueOf(str.indexOf("D"))+1)+"番目に出現");

		//指定位置からの文字列取得
		System.out.println("３文字目からの文字列→"+str.substring(2));
		
		
		//指定位置から指定位置までの文字列取得
		System.out.println("３、４文字目の文字列→"+str.substring(2,4));
		
			
		//大文字、小文字変換
		System.out.println("小文字にすると→"+str.toLowerCase());
		
		//文字の置換
		str = "a b c dd e f g　";
		System.out.print(str + "　：[dd]を[zzz]に置き換えると→"+str.replace("dd","zzz"));
		
		
		
		
	}

}
