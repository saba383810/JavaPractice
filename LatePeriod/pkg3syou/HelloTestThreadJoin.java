package pkg3syou;
//Smp4.java

/*
	スレッドの応用
	
	①名前フィールドを作成する（コンストラクタから指定）
	②みんな挨拶がおわったら報告する
*/

class Japan6 extends Thread{
	String name;
	public Japan6(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0; i < 10; i++) {
			System.out.println(name+" : こんにちは");//【太郎】こんにちは、のように表示する
			try{sleep(500);}catch(Exception e){}
		}
	}
}

class America6 extends Thread{
	String name;
	public America6(String name){
		this.name = name;
	}
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(name+" : ＨＥＬＬＯ！");//【TOM】Hello、のように表示する
			try{sleep(100);}catch(Exception e){}
		}
	}
}

class HelloTestThreadJoin{
	public static void main (String[] args ){
	
		Japan6 hanako = new Japan6("hanako");
		America6 tom = new America6("tom");
		Japan6 taro = new Japan6("taro");
		
		hanako.start();
		tom.start();
		taro.start();

		try{
			tom.join();
			taro.join();
			hanako.join();
		}catch (InterruptedException e){
			System.out.println(e);
		}

		//締めの言葉（スレッドが終わってから表示
		System.out.println("みんな、あいさつ１０回いいました");
	}
}