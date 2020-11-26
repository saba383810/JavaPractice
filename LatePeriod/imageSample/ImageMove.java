package imageSample;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import java.nio.file.Paths;

public class ImageMove extends Application {

    ImageView player,sun;
    Image flowerImg = new Image(Paths.get("images/flower.png").toUri().toString());
    Image tanpopoImg = new Image(Paths.get("images/tanpopo.png").toUri().toString());
    Image sunImg = new Image(Paths.get("images/sun.png").toUri().toString());

    int playerX,playerY,sunX,sunY;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("矢印キーを押してみよう！");
        stage.setWidth(1000);
        stage.setHeight(700);



        player = new ImageView(tanpopoImg);
        sun = new ImageView(sunImg);

        BorderPane root = new BorderPane();
        root.setTop(sun);
        root.setBottom(player);
        
        Scene scene = new Scene(root);
        
        scene.setOnKeyPressed(event -> onKeyPressed(event));
        stage.setScene(scene);
        new Thread(() ->move()).start();
        stage.show();

    }
    void onKeyPressed(KeyEvent event){
        if(event.getCode()== KeyCode.RIGHT&&playerX<770){
            playerX+=5;
            player.setTranslateX(playerX);
        }else if(event.getCode()== KeyCode.LEFT&&playerX>-80){
            playerX-=5;
            player.setTranslateX(playerX);
        }else if(event.getCode()== KeyCode.UP&&playerY>-405){
            playerY-=5;
            player.setTranslateY(playerY);
        }else if(event.getCode()== KeyCode.DOWN&&playerY<30){
            playerY+=5;
            player.setTranslateY(playerY);
        }else if(event.getCode() == KeyCode.SPACE){
            if (player.getImage()==flowerImg){
                player.setImage(tanpopoImg);
            }else {
                player.setImage(flowerImg);
            }
        }
    }

    public static void main(String[] args) { 
        launch();
    }
    void move(){
        for(int i=0;i<1000;i++){
            try {Thread.sleep(100);}catch(Exception e){}
            sun.setTranslateX(sunX++);
        }
    }
}
