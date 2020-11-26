package pkg8syou;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandle extends Application {
	public void start(Stage stage) {
		stage.setWidth(300);
		stage.setHeight(140);

//		Button button = new Button("ボタン");
//		button.setOnAction(event ->{
//			System.out.println("ボタンが押されました");
//			System.out.println("ラムダ式2行目の処理");
//		});

		Button button = new Button("ボタン");
		button.setOnAction(event ->onClick());

		BorderPane root = new BorderPane();
		root.setCenter(button);
		stage.setScene(new Scene(root));
		stage.show();
	}

	private void onClick() {
		System.out.println("hello!");
	}

	public static void main(String[] args) {
		launch();
	}
}
