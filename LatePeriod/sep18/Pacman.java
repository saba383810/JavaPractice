package sep18;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Pacman extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("パックマン");
        stage.setWidth(500);
        stage.setHeight(500);
        Group root = new Group(); //透明の土台
        //描画部品（Canvas）の生成
        final Canvas canvas = new Canvas(400,500);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        gc.setFill(Color.YELLOW); //枠の色
        gc.fillArc(150,100,100,100,35,290, ArcType.ROUND);
        gc.setFill(Color.BLACK); //枠の色
        gc.fillArc(205,110,10,20,20,320, ArcType.ROUND);
        //いろいろな描画

        root.getChildren().add(canvas); //土台に部品追加
        stage.setScene(new Scene(root, 400, 500));//Sceneに載せる
        stage.show(); //画面表示
    }
    public static void main(String[] args) {
        launch();
    }
}
