package pkg8syou;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LayoutExample6_Free extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(400);
		stage.setHeight(400);

		// (2) コントロールの生成
		Button button1 = new Button("みかん");
		Button button2 = new Button("はは");
		Button button3 = new Button("ゆずひこ");
		Button button4 = new Button("ちち");
		
		//座標の指定 ※Paneを使うので
		button1.setLayoutX(0);
		button2.setLayoutX(100);
		button3.setLayoutX(200);
		button4.setLayoutX(300);
		

		//画像
		Image im1 = new Image("mikan.png");
		ImageView iv1 = new ImageView(im1);
		iv1.setLayoutY(30);
		
		// (3) ルートペインを生成し、コントロールを配置
		Pane root = new Pane();
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		root.getChildren().add(button3);
		root.getChildren().add(button4);
		root.getChildren().add(iv1);
		
		

		// (4) ルートペインを元にシーンを生成
		Scene scene = new Scene(root);

		// (5) Stageにシーンを配置
		stage.setScene(scene);

		// (6) アプリケーションウィンドウを表示
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}