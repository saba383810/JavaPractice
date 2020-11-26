package pkg9syou;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Mouse extends Application {

	GraphicsContext gc;

	public void start(Stage stage) {
		stage.setWidth(400);
		stage.setHeight(400);

		Canvas canvas = new Canvas(400, 400);
		gc = canvas.getGraphicsContext2D();
		gc.setLineWidth(3);

		//マウスクリックした
		canvas.setOnMouseClicked(event -> mouseClicked(event));

		//p222から、他のイベントも取得しよう（ドラッグ、押す、離す、など）
		
		
		Group root = new Group();
		root.getChildren().add(canvas);
		stage.setScene(new Scene(root));
		stage.show();
	}

	void mouseClicked(MouseEvent event) {
		System.out.println("クリックした！");
		System.out.println(event.getX() +","+  event.getY());
	}





	public static void main(String[] args) {
		launch();
	}
}
