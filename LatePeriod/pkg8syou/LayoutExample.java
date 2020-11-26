package pkg8syou;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LayoutExample extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(1280);
		stage.setHeight(800);

		// (2) コントロールの生成
		Button button1 = new Button("January");
		Button button2 = new Button("February");
		Button button3 = new Button("March");
		Button button4 = new Button("April");

		button1.setPrefSize(200,100);
		button2.setPrefSize(200,100);
		button3.setPrefSize(200,100);
		button4.setPrefSize(200,100);



		// (3) ルートペインを生成し、コントロールを配置
		FlowPane root = new FlowPane();
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		root.getChildren().add(button3);
		root.getChildren().add(button4);

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