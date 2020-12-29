package state;

public class NoonState implements State{
    private static NoonState singleton =new NoonState();//シングルトンパターン、自分のインスタンスを作る
    private NoonState() { // コンストラクタはprivate

    }
    public static State getInstance() { // 唯一のインスタンスを得る
        return singleton;
    }
    public void doClock(Context context, int hour) { // 時刻設定
        if (hour>=13) { //時間をみて、状態を切り替える
            context.changeState(DayState.getInstance()); //夜にチェンジ
        }
    }
    public void doUse(Context context) { // 金庫使用
        context.recordLog("【正午】金庫不正使用！警備センター来てください！");
    }
    public void doAlarm(Context context) { // 非常ベル
        context.callSecurityCenter("【正午】ジリリリリリリー！警備センターきてください！");
    }
    public void doPhone(Context context) { // 通常通話
        context.callSecurityCenter("【正午】警備センター、電話呼び出し中・・・");
    }
    public String toString() { // 文字列表現
        return "[正午]";
    }
}
