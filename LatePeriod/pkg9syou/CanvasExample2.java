package pkg9syou;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class CanvasExample2 extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(300);
		stage.setHeight(200);

		// (2) キャンバスオブジェクトの生成
		 Canvas canvas = new Canvas(300, 200);
		 GraphicsContext gc = canvas.getGraphicsContext2D();

		 gc.moveTo(20, 20);
		 gc.lineTo(220, 150);
		 gc.lineTo(20, 150);

		 gc.moveTo(220, 20);
		 gc.lineTo(100, 130);

		 gc.setLineWidth(3);
		 gc.stroke();

		// (3) グループオブジェクトの生成
		Group root = new Group();
		root.getChildren().add(canvas);

		// (4) グループオブジェクトをもとに、シーンオブジェクトを生成
		Scene scene = new Scene(root);

		// (5) ステージにシーンを配置
		stage.setScene(scene);

		// (6) アプリケーションウィンドウを表示
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
