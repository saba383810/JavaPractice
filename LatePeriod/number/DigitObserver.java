package number;
//数値表示クラス（オブザーバーの立場）

public class DigitObserver implements Observer {
	
	//対象者からの通知を受け取った（generator：対象者=数値ジェネレーター）
	public void update(NumberGenerator generator) {

		//数値を表示しましょう
		System.out.println("DigitObserver:"  + generator.getNumber());
		
	}
}
