package Nov26;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DrawRectColor extends Application {
    //初期化
    public double firstX=0;
    public double firstY=0;
    public double endX=0;
    public double endY=0;

    Canvas canvas = new Canvas(500, 500);
    Canvas canvas2 = new Canvas(100, 500);
    GraphicsContext gc = canvas.getGraphicsContext2D();
    GraphicsContext gc2 = canvas2.getGraphicsContext2D();
    HBox hbox = new HBox();

    public void start(Stage stage) {
        stage.setWidth(650);
        stage.setHeight(550);

        //drawZone
        gc.setLineWidth(5);
        gc.setStroke(Color.BLACK);
        gc.strokeRect(0,0,500,500);

        //colorZone
        gc2.setLineWidth(5);
        gc2.strokeRect(0,0,100,500);

        //colorPallet
        gc2.fillRect(10,10,80,30);
        gc2.setFill(Color.RED);
        gc2.fillRect(10,50,80,30);
        gc2.setFill(Color.GREEN);
        gc2.fillRect(10,90,80,30);
        gc2.setFill(Color.BLUE);
        gc2.fillRect(10,130,80,30);
        gc2.setFill(Color.YELLOW);
        gc2.fillRect(10,170,80,30);
        gc2.setFill(Color.BROWN);
        gc2.fillRect(10,210,80,30);
        gc2.setFill(Color.GRAY);
        gc2.fillRect(10,250,80,30);
        gc2.setFill(Color.PINK);
        gc2.fillRect(10,290,80,30);

        gc2.setLineWidth(2);
        gc2.setStroke(Color.BLACK);
        gc2.strokeRect(10,330,80,30);
        gc2.setFont(new Font(20));
        gc2.setStroke(Color.BLACK);
        gc2.strokeText("C l e a r", 20,352);



        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(20, 20, 20, 20));

        hbox.getChildren().addAll(canvas,canvas2);
        canvas.setOnMousePressed(event -> mousePressedC1(event));
        canvas.setOnMouseReleased(event -> mouseReleasedC1(event));
        canvas2.setOnMousePressed(event -> mousePressedC2(event));

        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    void mousePressedC1(MouseEvent event) {
        firstX = event.getX();
        firstY = event.getY();
    }

    void mouseReleasedC1(MouseEvent event) {
        endX = event.getX();
        endY = event.getY();
        DrawRectCanvas();
    }

    void mousePressedC2(MouseEvent event) {
        double y = event.getY();
        if(y>=10&&y<=40) gc.setStroke(Color.BLACK);
        if(y>=50&&y<=80) gc.setStroke(Color.RED);
        if(y>=90&&y<=120) gc.setStroke(Color.GREEN);
        if(y>=130&&y<=160) gc.setStroke(Color.BLUE);
        if(y>=170&&y<=200) gc.setStroke(Color.YELLOW);
        if(y>=210&&y<=240) gc.setStroke(Color.BROWN);
        if(y>=250&&y<=280) gc.setStroke(Color.GRAY);
        if(y>=290&&y<=320) gc.setStroke(Color.PINK);
        if(y>=230&&y<=360) gc.clearRect(3, 3, 495, 495);

    }

    //描画
    public void DrawRectCanvas(){
        gc.setLineWidth(2);
        double width = Math.abs(firstX-endX);
        double height = Math.abs(firstY-endY);
        double smallX;
        double smallY;
        //最も小さいxとYを探す。
        if(firstX<endX) smallX=firstX;
        else smallX =endX;
        if(firstY<endY) smallY=firstY;
        else smallY = endY;

        //描画する
        gc.strokeRect(smallX,smallY, width, height);
    }
}
