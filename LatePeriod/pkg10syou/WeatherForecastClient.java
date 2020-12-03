package pkg10syou;

import java.io.*;
import java.net.Socket;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class WeatherForecastClient extends Application {

	TextArea textArea = new TextArea();

	public void start(Stage stage) {
		stage.setTitle("天気予報受信クライアント");
		stage.setWidth(300);
		stage.setHeight(200);

		Button button = new Button("予報を取得する");
		button.setOnAction(event -> buttonPressed());
		BorderPane root = new BorderPane();
		root.setCenter(textArea);
		root.setBottom(button);

		stage.setScene(new Scene(root));
		stage.show();
	}

	void buttonPressed() {
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String weather = reader.readLine();
			textArea.appendText("サーバーから受け取った予報 [" + weather + "]\n");
			reader.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		launch();
	}
}
