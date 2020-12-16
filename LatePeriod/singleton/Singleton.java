package singleton;

public class Singleton {
	//フィールド
	private static Singleton singleton =new Singleton();

	
	//コンストラクタ
	private Singleton(){
    }
	
	//メソッド
    static Singleton getInstance(){
	    return singleton;
    }
	
}
