package tanpopo;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.nio.file.Paths;

public class Taiyou  extends ImageView implements Runnable{

    int x;
    static Image sunImg = new Image(Paths.get("images/sun.png").toUri().toString());
    Taiyou() {
        super(sunImg);
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            setTranslateX(x++);
        }
    }
}
