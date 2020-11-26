package pkg9syou;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javafx.geometry.Point2D;

public class GraphicsExample extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(500);
		stage.setHeight(530);

		// (2) キャンバスオブジェクトの生成
		Canvas canvas = new Canvas(500, 530);
		GraphicsContext gc = canvas.getGraphicsContext2D();

		int N = 20;
		int r = 200;
		ArrayList<Point2D> points = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			double x = 250 + r * Math.cos(2 * Math.PI * i / N);
			double y = 250 + r * Math.sin(2 * Math.PI * i / N);
			points.add(new Point2D(x, y));
		}

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				gc.moveTo(points.get(i).getX(), points.get(i).getY());
				gc.lineTo(points.get(j).getX(), points.get(j).getY());
			}
		}

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
