package pkg9syou;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class SimpleShapeExample2 extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(300);
		stage.setHeight(200);

		// (2) シェイプオブジェクトの生成
		Arc arc = new Arc(40, 60, 30, 30, 45, 120);

		Ellipse elipse = new Ellipse(120, 40, 30, 20);

		Line line = new Line(20, 100, 70, 130);
		line.setStrokeWidth(3);

		double[] points = { 90, 80, 140, 110, 120, 130 };
		Polygon polygon = new Polygon(points);

		double[] points2 = { 150, 80, 200, 110, 150, 130, 200, 80 };
		Polyline polyline = new Polyline(points2);

		// (3) グループオブジェクトの生成
		Group root = new Group();
		root.getChildren().addAll(arc, elipse, line, polygon, polyline);

		// (4) グループをもとに、シーンを生成
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