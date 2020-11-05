package pkg4syou;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
	
//		Runtimeクラス（langパッケージ）
//		https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/Runtime.html
		
		//Runtimeインスタンス取得
		Runtime r = Runtime.getRuntime();
		//Runtime r2 = new Runtime.

		System.out.println(Runtime.version());	//javaバージョン
		System.out.println(r.totalMemory());	//仮想メモリ全体
		System.out.println(r.freeMemory());		//フリー
		
		//r.exec();	//他アプリの実行 文字列でコマンド指定


	}

}
