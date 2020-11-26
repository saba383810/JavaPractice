package pkg6syou;

import javax.swing.*;

//関数型インタフェース（抽象メソッドが１つだけ）
//
interface SimpleInterface {
	public int doSomething(int n);
}
class Dummy implements SimpleInterface{

	@Override
	public int doSomething(int n) {
		return n+1;
	}
}

//実行プログラム
public class LambdaExample {
	
	//printoutメソッド、引数は関数型インターフェース
	static void printout(SimpleInterface i) {
		System.out.println(i.doSomething(2));
	}

	//main
	public static void main(String[] args) {
		//メソッドの呼び出し

 		//（１）普通にクラスをつくる場合
		printout(new Dummy() );

		//（２）匿名クラスで作る場合
		printout(new SimpleInterface() {
			@Override
			public int doSomething(int n) {
				return n+1;
			}
		});
		
		//(3)ラムダ式
		printout((int n)->{return n+1;} );



		//ラムダ省略もろもろ
		//省略１、引数の型なし
		printout( (n)->{return n+1;});
		
		//省略２、()カッコなし
		printout(n -> {return n+1;});
		
		//省略３、｛｝とｒｅｔｕｒｎとセミコロンなし（セット）
		printout(n -> n+1);
	}
}
