package stages;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URI;

public class Stage3 extends Stage {
    Image charaImg = new Image(getClass().getResourceAsStream("GawrGura.jpeg"));
    public Stage3(){
        this.setTitle("2つ目の画面"); //title
        this.setWidth(1280); //画面幅
        this.setHeight(720); //画面高さ
        Label lb3 = new Label("コンニチハ〜。サメで〜す。");
        lb3.setFont(Font.font(48));
        lb3.setTextFill(Color.GRAY);
        Label guraImgLb = new Label();
        guraImgLb.setGraphic(new ImageView(charaImg));

        //「終了」のボタン
        Button btnDetail = new Button("GawrGuraの詳細へ");
        btnDetail.setFont(Font.font(20));
        btnDetail.setPrefWidth(300);
        btnDetail.setOnAction(event -> webLoad());

        Button btnEnd = new Button("終了");
        btnEnd.setFont(Font.font(20));
        btnEnd.setPrefWidth(300);
        btnEnd.setOnAction(event -> System.exit(0));

        //レイアウトは VBox（縦並び）で
        VBox root = new VBox();
        root.getChildren().addAll(lb3,guraImgLb,btnDetail,btnEnd);
        root.setSpacing(50.0);
        root.setAlignment(Pos.CENTER);

        //Scene を作り、Stage にセットする
        Scene sc = new Scene(root);
        this.setScene(sc);
        this.show(); //画面表示
    }
    public void webLoad(){
        Desktop desktop = Desktop.getDesktop();
        //Guraのweb表示
        close();
        String website = "https://www.youtube.com/channel/UCoSrY_IQQVpmIRZ9Xf-y93g";
        try {
            desktop.browse(new URI(website));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
