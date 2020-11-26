package JavaFXSample;

import javafx.scene.image.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.nio.file.Paths;


public class HelloJavaFX extends Application {
    Label lb;

    @Override
    public void start(Stage stage) {

        stage.setTitle("Hello, JavaFX");	//タイトル
        stage.setWidth(540);				//幅
        stage.setHeight(220);				//高さ

        lb = new Label("Hello, JavaFX");//ラベル（部品名）
        lb.setAlignment(Pos.CENTER);		//揃え
        lb.setFont(new Font(64));			//フォント

        Button btnExit = new Button("閉じる"); //ボタン生成
        btnExit.setPrefWidth(300);	//幅
        btnExit.setOnAction(event -> Platform.exit()); //終了

        Button btnHello = new Button("Hello"); //ボタン生成
        btnHello.setPrefWidth(300);	//幅
        btnHello.setOnAction(event -> btnHello_Action(event)); //終了

        VBox vbox = new VBox();	//縦レイアウト
        vbox.setAlignment(Pos.CENTER);	//中央揃え
        Image img = new Image(Paths.get("GawrGura.jpg").toUri().toString());
        ImageView iv = new ImageView(img);
        //VBoxの管理する部品
        vbox.getChildren().addAll(lb, btnExit,btnHello ,iv);

        Scene sc = new Scene(vbox);	//VBoxをSceneに登録
        stage.setScene(sc);		//ステージにシーンをセット
        stage.show();						//ステージ表示
    }
    public static void main(String[] args) {
        launch();							//start呼ぶ
    }

    protected void btnHello_Action(ActionEvent event) {
        Alert dialog = new Alert(AlertType.INFORMATION);
        dialog.setHeaderText(null);
        dialog.setContentText("Hello!");
        lb.setText("hello Clicked JavaFX");

        dialog.showAndWait();
    }
}