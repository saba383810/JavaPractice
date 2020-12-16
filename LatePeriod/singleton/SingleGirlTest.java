package singleton;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class SingleGirlTest extends Application {
	@Override
	public void start(Stage stage) throws Exception {

		stage.setWidth(200);
		stage.setHeight(200);

		//女の子のImageViewのインスタンスを取得する

		SingleGirl obj1 = SingleGirl.getInstance();

		Button b1 = new Button("チェンジ！");
		b1.setOnMouseClicked(event -> btn1Press(stage));

		FlowPane root = new FlowPane();
		root.getChildren().addAll(obj1,b1);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	
	}
	//ボタンの押したときここにくる
	private void btn1Press(Stage stage) {
		System.out.println("チェンジボタン押した");
		//ImageView（SingekGirl）のインスタンスをゲットする
		SingleGirl s =  SingleGirl.getInstance();
		//画像変更
		s.change();
	}
	public static void main(String[] args) {
		launch();
	}
}
