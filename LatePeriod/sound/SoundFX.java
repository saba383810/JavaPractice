package sound;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;
import java.nio.file.Paths;

public class SoundFX extends Application {
    PlayClip pc; //Clip 管理クラス
    //--------main----------
    public static void main (String[] args){
        System.out.println("main");
        launch();
    }
    //--------strat----------
    public void start(Stage stage) throws Exception {
        stage.setTitle("音楽を楽しもう");
        stage.setWidth(500);
        stage.setHeight(150);
        Image playImg =new Image(Paths.get("images/play.png").toUri().toString());
        Image stopImg =new Image(Paths.get("images/stop.png").toUri().toString());
        Image resetImg =new Image(Paths.get("images/reset.png").toUri().toString());
        Image forwardImg =new Image(Paths.get("images/forward.png").toUri().toString());
//        Image playImg =new Image(getClass().getResourceAsStream("/images/play.png"));
//        Image stopImg =new Image(getClass().getResourceAsStream("/images/stop.png"));
//        Image resetImg =new Image(getClass().getResourceAsStream("/images/reset.png"));
//        Image forwardImg =new Image(getClass().getResourceAsStream("/images/forward.png"));
        Button btnPlay = new Button("", new ImageView(playImg)); //ボタン群の生成
        btnPlay.setOnMouseClicked(event -> play(stage)); //ボタンにメソッド登録
        Button stopBtn = new Button("",new ImageView(stopImg));
        stopBtn.setOnMouseClicked(event ->stop(stage));
        Button resetBtn = new Button("",new ImageView(resetImg));
        resetBtn.setOnMouseClicked(event ->reset(stage));
        Button forwardBtn = new Button("",new ImageView(forwardImg));
        forwardBtn.setOnMouseClicked(event ->forward(stage));
        FlowPane root = new FlowPane(); //横並びレイアウト
        root.getChildren().addAll(btnPlay,stopBtn,resetBtn,forwardBtn); //レイアウトに載せる子ども（部品）たち


        stage.setScene(new Scene(root));
        stage.show();
        pc = new PlayClip("bgm1.wav"); //音声情報 PlayClip 生成→準備だけて、再生はあと。
    }

    private void stop(Stage stage) {
        pc.stop();
    }
    //--------strat----------
    void play(Stage stage){
        pc.play(); //音声スタート
    }
    void reset(Stage stage){
        pc.reset();
    }
    void forward(Stage stage){
        pc.forward();
    }
}