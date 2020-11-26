package pkg9syou;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SimpleDraw extends Application {

	GraphicsContext gc;

	public void start(Stage stage) {
		stage.setWidth(400);
		stage.setHeight(400);

		Canvas canvas = new Canvas(400, 400);
		gc = canvas.getGraphicsContext2D();
		gc.setLineWidth(3);

		canvas.setOnMousePressed(event -> mousePressed(event));
		canvas.setOnMouseDragged(event -> mouseDragged(event));

		Group root = new Group();
		root.getChildren().add(canvas);
		stage.setScene(new Scene(root));
		stage.show();
	}

	void mousePressed(MouseEvent event) {
		gc.moveTo(event.getX(), event.getY());
	}

	void mouseDragged(MouseEvent event) {
		gc.lineTo(event.getX(), event.getY());
		gc.stroke();
	}

	public static void main(String[] args) {
		launch();
	}
}
