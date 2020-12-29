package state;

import singleton.Singleton;

//DayStateクラス、昼間の状態を表すクラス
public class DayState implements State {
    private static DayState singleton = new DayState() ;//シングルトンパターン、自分のインスタンスを作る
    private DayState() { // コンストラクタはprivate
    }
    public static State getInstance() { // 唯一のインスタンスを得る
        return singleton;
    }
    public void doClock(Context context, int hour) { // 時刻設定
        if (hour <9||hour>=17) { //時間をみて、状態を切り替える
            context.changeState(NightState.getInstance()); //夜にチェンジ
        }else if(hour>=12&&hour<13){
            context.changeState(NoonState.getInstance());
        }
    }
    public void doUse(Context context) { // 金庫使用
        context.recordLog("【昼間】金庫を使用しました");
    }
    public void doAlarm(Context context) { // 非常ベル
        context.callSecurityCenter("【昼間】ジリリリリリリー！警備センターきてください！");
    }
    public void doPhone(Context context) { // 通常通話
        context.callSecurityCenter("【昼間】警備センター、電話呼び出し中・・・");
    }
    public String toString() { // 文字列表現
        return "[昼間]";
    }
}
