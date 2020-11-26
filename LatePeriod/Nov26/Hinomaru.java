package Nov26;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Hinomaru extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("日の丸の課題");
        stage.setWidth(400);
        stage.setHeight(300);
        Group root = new Group(); //透明の土台
        //描画部品（Canvas）の生成
        final Canvas canvas = new Canvas(400,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(2.0); //線の太さ
        gc.setStroke(Color.BLACK); //枠の色
        gc.strokeRect(50, 50, 300, 200); //四角
        gc.setFill(Color.RED); //枠の色
        gc.fillOval(150,100,100,100);
        //いろいろな描画

        root.getChildren().add(canvas); //土台に部品追加
        stage.setScene(new Scene(root, 400, 500));//Sceneに載せる
        stage.show(); //画面表示
    }
    public static void main(String[] args) {
        launch();
    }

}