package pkg3syou;
//HelloTestThread.java

/*
	HelloTestをコピーしています。これをもとに、並列処理に作り替えてみよう
	(教科書ｐ６０参考）
	
	①Runnableインタフェースを実装する
	②public void run()メソッドを実装する				
	③呼び出し側でThreadクラスを作成し、start()することにより、run()が実行される
*/

//----------------------------------
//日本人クラス
//----------------------------------
class Japan3 extends Object implements Runnable{
	public void run(){
		for(int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
			try{Thread.sleep(100);}catch(Exception e){}	//0.1秒sleep
		}
	}
}
//----------------------------------
//アメリカ人クラス
//----------------------------------
class America3 extends Object implements Runnable{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("Hello!");
			try{Thread.sleep(100);}catch(Exception e){}//0.1秒sleep
		}
	}
}

class HelloTestRunnable{
	public static void main (String[] args ){
	
		//花子インスタンス生成
		Japan3 hanako = new Japan3();
		
		//tomインスタンス生成
		America3 tom = new America3();
		Thread t1 = new Thread(hanako);
		Thread t2 = new Thread(tom);
		//花子さん、挨拶する
		t1.start();
		
		//tomさん、挨拶する
		t2.start();
	
	}
}