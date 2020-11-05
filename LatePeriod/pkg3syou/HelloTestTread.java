package pkg3syou;
//HelloTestThread.java

/*
 	HelloTestをコピーしています。これをもとに、並列処理に作り替えてみよう
 	（教科書p57参考）

	①Threadクラスを継承する
	②public void run()メソッドを実装する				
	③呼び出し側でstart()することにより、run()が実行される
*/

//----------------------------------
//日本人クラス
//----------------------------------
class Japan2 extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
			try{sleep(100);}catch(Exception e){}	//0.1秒sleep
		}
	}
}
//----------------------------------
//アメリカ人クラス
//----------------------------------
class America2 extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("Hello!");
			try{sleep(100);}catch(Exception e){}//0.1秒sleep
		}
	}
}

class HelloTestTread{
	public static void main (String[] args ){
	
		//花子インスタンス生成
		Japan2 hanako = new Japan2();
		
		//tomインスタンス生成
		America2 tom = new America2();
		
		//花子さん、挨拶する
		hanako.start();
		
		//tomさん、挨拶する
		tom.start();
	}
}