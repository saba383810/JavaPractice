package stages;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Stage2 extends Stage {
    Stage st1;
    Stage st3;
    TextField input;
    Label lb;
    public Stage2(Stage st1,Label lb){
        this.lb = lb;
        this.st1= st1;
        this.setTitle("2つ目の画面"); //title
        this.setWidth(1280); //画面幅
        this.setHeight(720); //画面高さ
        Label lb2 = new Label("2つ目の画面だよ");
        lb2.setFont(Font.font(48));
        lb2.setTextFill(Color.GRAY);
        //テキスト



        input = new TextField();
        input.setMaxWidth(300);

        Button btnNext = new Button("GawrGuraを表示");
        btnNext.setFont(Font.font(20));
        btnNext.setPrefWidth(300);
        btnNext.setOnAction(event -> OnNextPress());


        Button btnReturn = new Button("テキストを送信");
        btnReturn.setFont(Font.font(20));
        btnReturn.setPrefWidth(300);
        btnReturn.setOnAction(event -> OnReturnPress());

        //「終了」のボタン
        Button btnEnd = new Button("終了");
        btnEnd.setFont(Font.font(20));
        btnEnd.setPrefWidth(300);
        btnEnd.setOnAction(event -> System.exit(0));

        //レイアウトは VBox（縦並び）で
        VBox root = new VBox();
        root.getChildren().addAll(lb2,input, btnReturn,btnNext,btnEnd);
        root.setSpacing(50.0);
        root.setAlignment(Pos.CENTER);

        //Scene を作り、Stage にセットする
        Scene sc = new Scene(root);
        this.setScene(sc);
        this.show(); //画面表示
    }
    public void OnReturnPress(){
        //stage1を呼び出
        String str = input.getText();
        System.out.println(str);
        lb.setText("入力された値は『"+str+"』です");
        this.close();

        st1.show();
    }
    public void OnNextPress() {
        this.close();
        //Stage2 クラスのインスタンスを生成する

        st3 = new Stage3();

    }
}
