package state;

public class NightState implements State{
    private static NightState singleton =new NightState();//シングルトンパターン、自分のインスタンスを作る
    private NightState() { // コンストラクタはprivate

    }
    public static State getInstance() { // 唯一のインスタンスを得る
        return singleton;
    }
    public void doClock(Context context, int hour) { // 時刻設定
        if (hour >=9&& 17>hour) { //時間をみて、状態を切り替える
            context.changeState(DayState.getInstance()); //夜にチェンジ
        }
    }
    public void doUse(Context context) { // 金庫使用
        context.recordLog("【夜間】金庫不正使用！警備センターきてください！");
    }
    public void doAlarm(Context context) { // 非常ベル
        context.callSecurityCenter("【夜間】ジリリリリリリー！警備センターきてください！");
    }
    public void doPhone(Context context) { // 通常通話
        context.callSecurityCenter("【夜間】録音します。要件をお伝えください。");
    }
    public String toString() { // 文字列表現
        return "[夜間]";
    }
}
