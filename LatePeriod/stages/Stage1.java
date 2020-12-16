package stages;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Stage1 extends Application {
    Stage stage1;
    Stage stage2;
    Label lb;

    //--------main----------
    public static void main (String[] args){ launch();}

    //-------start-------------
    public void start(Stage stage) {

        stage1 = stage;

        stage.setTitle("１つ目の画面"); //title
        stage.setWidth(1280); //画面幅
        stage.setHeight(720); //画面高さ
        lb = new Label("最初の画面だよ");
        lb.setFont(Font.font(48));
        lb.setTextFill(Color.GRAY);

//「次の画面へ」のボタン
        Button btnNext = new Button("次の画面へ");
        btnNext.setFont(Font.font(20));
        btnNext.setPrefWidth(300);

        btnNext.setOnAction(event -> nextPress());

        //「終了」のボタン
        Button btnEnd = new Button("終了");
        btnEnd.setFont(Font.font(20));
        btnEnd.setPrefWidth(300);
        btnEnd.setOnAction(event -> System.exit(0));

        //レイアウトは VBox（縦並び）で
        VBox root = new VBox();
        root.getChildren().addAll(lb, btnNext,btnEnd);
        root.setSpacing(50.0);
        root.setAlignment(Pos.CENTER);

        //Scene を作り、Stage にセットする
        Scene sc = new Scene(root);
        stage.setScene(sc);

        stage.show(); //画面表示
    }
    //----「次の画面」ボタンから呼び出されるメソッド
    public void nextPress() {
        stage1.close();
        //Stage2 クラスのインスタンスを生成する
        if(stage2 == null) {
            stage2 = new Stage2(this.stage1,lb);
        }else{
            stage2.show();
        }
    }
}
