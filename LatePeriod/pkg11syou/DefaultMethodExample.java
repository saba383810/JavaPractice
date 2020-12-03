package pkg11syou;

//インタフェース・・・機能の実装
interface SayHello {
	//デフォルトメソッド・・・このインターフェースを実装した人は、必ずしもhelloを書かなくてもいいよ。ということ
	default void hello() {
		System.out.println("Hello");
	}
}
interface SayHello2 {
	//普通はこう書く
	void hello(); 
}
class EnglishGreet implements SayHello{

}

class JapaneseGreet implements SayHello {

	//日本のあいさつは「こんにちは」
	@Override
	public void hello(){
		System.out.println("こんにちは！");
	}
}

public class DefaultMethodExample {
	public static void main(String[] args) {
		SayHello a = new EnglishGreet();
		SayHello b = new JapaneseGreet();
		a.hello();
		b.hello();
	}
}
