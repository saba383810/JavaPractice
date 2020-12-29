package state;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//金庫警備システムの画面（main)
public class SafeMain extends Application implements Context {

    TextField textClock = new TextField(); // 現在時刻表示
    TextArea textScreen = new TextArea(); // 警備センター出力
    private State state = DayState.getInstance(); //最初は昼間の状態とする

    //-----main---------------
    public static void main (String[] args){
        launch();
    }
    //----start----------------
    @Override
    public void start(Stage stage) throws Exception {
        Button buttonUse = new Button("金庫使用"); // 金庫使用ボタン
        Button buttonAlarm = new Button("非常ベル"); // 非常ベルボタン
        Button buttonPhone = new Button("電話"); // 通常通話ボタン
        Button buttonExit = new Button("終了"); // 終了ボタン

        stage.setTitle("金庫");
        stage.setWidth(500);
        stage.setHeight(500);
        HBox boxB = new HBox(); //ボタンたちのレイアウトは横で
        boxB.getChildren().addAll(buttonUse,buttonAlarm,buttonPhone,buttonExit);

        //各ボタンのメソッド登録
        buttonUse.setOnMouseClicked(event -> use(stage));
        buttonAlarm.setOnMouseClicked(event -> alarm(stage));
        buttonPhone.setOnMouseClicked(event -> phone(stage));
        buttonExit.setOnMouseClicked(event -> exit(stage));

        //全体は縦レイアウトで
        VBox root = new VBox();
        root.getChildren().addAll(textClock,textScreen,boxB);
        //スレッドの準備（ここで時間が進んでいく）
        class MyTask extends Thread{
            public void run() {
                while(true) {
                    for (int hour = 0; hour < 24; hour++) {
                        setClock(hour); // 時刻の設定
                        try {Thread.sleep(1000);}catch(InterruptedException e) {}
                    }
                }
            }
        }
        //スレッド開始、時間を進める
        MyTask mt = new MyTask();
        mt.start();
        //stageにsceneをセットして、画面表示
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void exit(Stage stage) {
        System.out.println("システムを正常終了しました。");
        System.exit(0);
    }

    private void phone(Stage stage) {
        state.doPhone(this);
    }

    private void alarm(Stage stage) {
        state.doAlarm(this);
    }

    //---ボタン押したときの処理
    void use(Stage stage) {//金庫使用
        state.doUse(this);
    }
//他の処理省略

    //---時刻の設定-----------------
    public void setClock(int hour) {
        String clockstring = "現在時刻は";
        if (hour < 10) {
            clockstring += "0" + hour + ":00";
        } else {
            clockstring += hour + ":00";
        }
        textClock.setText(clockstring);//時間を画面に表示
        state.doClock(this, hour); //stateの切り替え
        System.out.println(clockstring);
    }

    //---状態変化-----------------
    public void changeState(State state) {
        System.out.println(this.state + "から" + state + "へ状態が変化しました。");
        this.state = state;
    }
    //---警備センター警備員呼び出し
    public void callSecurityCenter(String msg) {
        textScreen.appendText("call ..." + msg + "\n");
    }
    //---警備センター記録
    public void recordLog(String msg) {
        textScreen.appendText("record ... " + msg + "\n");
    }
}