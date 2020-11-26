package Nov26;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class RandomCircle extends Application {

    public void start(Stage stage) {
        stage.setWidth(300);
        stage.setHeight(300);
        Group root = new Group();
        for(int i=0;i<20;i++) {

            Random r = new Random();
            Circle circle = new Circle(r.nextInt(300), r.nextInt(300), r.nextInt(40)+10);
            circle.setFill(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
            root.getChildren().add(circle);
        }

        Scene scene = new Scene(root);
        stage.setScene(scene);

        // (6) アプリケーションウィンドウを表示
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
