package tanpopo;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.nio.file.Paths;

public class Bee extends ImageView implements Runnable {
    int x;
    static Image beeImg = new Image(Paths.get("images/bee.png").toUri().toString());
    Bee(){
        super(beeImg);
    }
    public void run(){
        for(int l=0;l<10;l++) {
            setScaleX(1);
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

                setTranslateX(x++);
            }
            setScaleX(-1);
            for (int i = 0; i < 500; i++) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }

                setTranslateX(x--);
            }
        }
    }
}
