package tanpopo;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import java.nio.file.Paths;
import javafx.scene.image.ImageView;


public class Tanpopo extends ImageView {

    static Image tanpopoImage = new
            Image(Paths.get("images/tanpopo.png").toUri().toString());
    static Image flowerImg = new
            Image(Paths.get("images/flower.png").toUri().toString());
    //ｘ座標
    int x;
    int y;
    //コンストラクタ
    Tanpopo(){
        super(tanpopoImage);
    }
    //moveメソッド ※矢印キー、スペースキーを調べて、タンポポを動かす
    public void move(KeyCode key){
        if(key==KeyCode.RIGHT&&x<770) x+=5;
        if(key==KeyCode.LEFT&&x>-80) x-=5;
        if(key==KeyCode.UP&&y>-405) y-=5;
        if(key==KeyCode.DOWN&&y<30) y+=5;

        setTranslateX(x);
        setTranslateY(y);
    }
    public void changeImage( ){
        if(getImage()==flowerImg) setImage(tanpopoImage);
        else setImage(flowerImg);

    }
}
