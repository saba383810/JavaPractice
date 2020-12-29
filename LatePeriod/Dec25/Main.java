package Dec25;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.nio.file.Paths;

public class Main extends Application {
    //共通的に使う変数はここに書く
    Tanpopo tanpopo;
    Taiyou sun;
    Bee bee;
    static Image backgroundImg = new Image(Paths.get("images/background.png").toUri().toString());

    @Override
    public void start(Stage stage)
    {
        //Stage設定、タイトル、大きさ
        stage.setTitle("矢印キーを押してごらん");
        stage.setWidth(1000);
        stage.setHeight(700);

        tanpopo = new Tanpopo();
        sun = new Taiyou();
        bee = new Bee();
//        Thread sunThread = new Thread(sun);
//        Thread beeThread = new Thread(bee);
        bee.addObserver(sun  );
        Pane root = new Pane();
        root.getChildren().addAll(sun,bee,tanpopo);

        BackgroundImage bimg = new BackgroundImage(backgroundImg, null, null, null, null);
        Background bg1 = new Background(bimg);
        root.setBackground(bg1);

        Scene scene = new Scene(root);

        scene.setOnKeyPressed(event -> keyPress(event));

        stage.setScene(scene);
        //×ボタンで、プログラム終了

        stage.setOnCloseRequest(event -> System.exit(0));

        stage.show();
//        beeThread.start();
//        sunThread.start();
    }

    // キーが押された時の処理
    public void keyPress(KeyEvent event)
    {
        if (event.getCode() == KeyCode.RIGHT) {//右→
            tanpopo.move(KeyCode.RIGHT);
        }
        if (event.getCode() == KeyCode.LEFT) {//hidari
            tanpopo.move(KeyCode.LEFT);
        }
        if (event.getCode() == KeyCode.UP) {//ue
            tanpopo.move(KeyCode.UP);
        }
        if (event.getCode() == KeyCode.DOWN) {//sita
            tanpopo.move(KeyCode.DOWN);
        }
        if(event.getCode() == KeyCode.SPACE) {//supe-su
            bee.move(tanpopo.x);
        }
    }
    public static void main (String[] args){
        System.out.println("画像を表示して、矢印キーで動かしてみよう");


        launch();
    }
}
