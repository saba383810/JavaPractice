package builder;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.List;

public class FxStart  extends Application  {
    public void start(Stage stage){
        List<String> args;
        Parameters params = getParameters();
        args = params.getRaw();
        System.out.println(args.size());
        for (String each :args){
            args.add(each);

        }
        stage.setWidth(400);
        stage.setHeight(400);
        //女の子のImageViewのインスタンスを取得する
        Label h1 = new Label("test");
        h1.setPrefSize(150,100);
        h1.setAlignment(Pos.CENTER);
//        Label h2 = new Label(args.get(1));


        FlowPane root = new FlowPane();
        root.getChildren().addAll(h1);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public static void FxMain(String[] args){
        launch(args);
    }
}
