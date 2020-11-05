package pkg1syou;

import mypackage.*;

//自分が作成した別なパッケージから呼び出して使ってみよう。
//①新しいパッケージ「mypackage」を作成する
//②MyClassクラスをつくる。メソッドはprintMessage()のみ（何か表示すでばよい、教科書23参照しても）
//③このプログラムが実行できるようにしよう。importはいる？

public class MyClassTest {

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();//ここがエラーになっているはず、上記①~③対応
		mc.printMessage();		//"mypackageのMyClassです”のメッセージが出る
		
	}

}
