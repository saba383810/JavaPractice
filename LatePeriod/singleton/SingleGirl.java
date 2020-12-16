package singleton;


import java.nio.file.Paths;
import java.util.concurrent.Exchanger;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SingleGirl extends ImageView{
	private static Image img = new Image(Paths.get("images/mikan.png").toUri().toString());
	private static Image img2 = new Image(Paths.get("images/titi.png").toUri().toString());
	
	private static SingleGirl s = new SingleGirl();

	
	//コンストラクタ作成
	private SingleGirl(){
		super(img);
	}
	//getInstance作成
	
	static SingleGirl getInstance(){
		return s;
	}

	//画像チェンジ処理
	public void change(){
		if(s.getImage()==img) {
			s.setImage(img2);
		}else{
			s.setImage(img);
		}
	}
}
