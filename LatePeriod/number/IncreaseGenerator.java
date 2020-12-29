package number;

import java.util.Random;

public class IncreaseGenerator extends NumberGenerator {
    private Random random = new Random();   // 乱数生成機
    private int number;                     // 現在の数

    // 数を取得する
    public int getNumber() { return number;}

    //動作開始
    public void execute() {

        //適当な回数、乱数を取得して、オブザーバーに通知
        for (int i = 0; i < 20; i++) {

            number = i;

            //通知する
            notifyObservers();

            //１秒おく（速く動きすぎるので）
            try {Thread.sleep(100);} catch (InterruptedException e) {}
        }
    }
}
