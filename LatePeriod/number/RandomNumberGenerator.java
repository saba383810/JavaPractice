package number;

//対象者　RandomNumberGenerator
//対象者インタフェース(NumberGenerator)を実装する

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	
    private Random random = new Random();   // 乱数生成機
    private int number;                     // 現在の数
	
	// 数を取得する
    public int getNumber() { return number;}

	//動作開始
    public void execute() {
    	
    	//適当な回数、乱数を取得して、オブザーバーに通知
		for (int i = 0; i < 20; i++) {
			
			number = random.nextInt(50);
			
			//通知する
			notifyObservers();
			
			//１秒おく（速く動きすぎるので）
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}
