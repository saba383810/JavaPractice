package Nov19;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class janken extends Application {

    Random rand = new Random();
    public int wonCnt = 0;

    public ImageView  playerImg;
    public ImageView enemyImg;
    Image rockImg = new Image(getClass().getResourceAsStream("rock.png"));
    Image scissorsImg = new Image(getClass().getResourceAsStream("scissors.png"));
    Image paperImg = new Image(getClass().getResourceAsStream("paper.png"));
    Image questionImg = new Image(getClass().getResourceAsStream("mark_question.png"));
    Label title = new Label(" ジャンケンゲーム！");
    Label battleZone = new Label("-----バトルゾーン-----");
    Label player = new Label("Player");
    Label enemy = new Label("COM");
    Label battleCntLabel = new Label("バトルカウント");
    Label battleCntNum = new Label("0/30");
    Label wonCntLabel = new Label("勝利数カウント");
    Label battleMsg = new Label("");
    Label wonCntNum = new Label(wonCnt+"/30");
    Label percentLabel =new Label("0%");

    public int battleCnt =0;

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(500);
        stage.setHeight(700);

        playerImg = new ImageView(questionImg);
        enemyImg = new ImageView(questionImg);

        Button rockBtn = new Button("");
        rockBtn.setGraphic(new ImageView(rockImg));
        rockBtn.setOnAction(event ->battle(0));

        Button scissorsBtn = new Button("");
        scissorsBtn.setGraphic(new ImageView(scissorsImg));
        scissorsBtn.setOnAction(event ->battle(1));

        Button paperBtn = new Button("");
        paperBtn.setGraphic(new ImageView(paperImg));
        paperBtn.setOnAction(event ->battle(2));

        rockBtn.setPrefSize(150, 150);
        scissorsBtn.setPrefSize(150, 150);
        paperBtn.setPrefSize(150, 150);
        title.setPrefSize(150,100);
        battleZone.setPrefSize(150,100);
        player.setPrefSize(150,100);
        player.setAlignment(Pos.CENTER);
        enemy.setPrefSize(150,100);
        enemy.setAlignment(Pos.CENTER);
        battleCntLabel.setPrefSize(150,100);
        battleCntLabel.setAlignment(Pos.CENTER);
        battleCntNum.setPrefSize(150,100);
        battleCntNum.setAlignment(Pos.CENTER);
        battleMsg.setPrefSize(150,100);
        battleMsg.setAlignment(Pos.CENTER);
        percentLabel.setPrefSize(150,150);
        percentLabel.setAlignment(Pos.CENTER);

        wonCntLabel.setPrefSize(150,100);
        wonCntLabel.setAlignment(Pos.CENTER);
        wonCntNum.setPrefSize(150,100);
        wonCntNum.setAlignment(Pos.CENTER);

        GridPane root = new GridPane();
        GridPane.setConstraints(title, 1, 0);
        GridPane.setConstraints(rockBtn, 0, 1);
        GridPane.setConstraints(scissorsBtn, 1, 1);
        GridPane.setConstraints(paperBtn, 2, 1);
        GridPane.setConstraints(battleZone, 1, 2);

        GridPane.setConstraints(playerImg, 0, 3);
        GridPane.setConstraints(enemyImg, 2, 3);
        GridPane.setConstraints(player, 0, 4);
        GridPane.setConstraints(enemy, 2, 4);
        GridPane.setConstraints(battleCntLabel, 0, 5);
        GridPane.setConstraints(battleCntNum, 1, 5);
        GridPane.setConstraints(battleMsg, 1, 3);
        GridPane.setConstraints(wonCntLabel, 0, 6);
        GridPane.setConstraints(wonCntNum, 1, 6);
        GridPane.setConstraints(percentLabel,2,6);

        root.getChildren().addAll(title,rockBtn, scissorsBtn, paperBtn ,battleZone,playerImg,
                enemyImg,enemy,player,battleCntLabel,battleCntNum,wonCntLabel,wonCntNum,battleMsg,percentLabel);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    /* battle
        グー  : 0
        チョキ: 1
        パー  : 2

        (自分の手 - 相手の手 + 3) % 3

        引き分け : 0
        負け : 1
        勝ち : 2
         */
    private void battle (int playerHand){
        if(battleCnt>29) return;

        battleCnt++;
        battleCntNum.setText(battleCnt+"/30");

        //プレイヤー画像セット
        if(playerHand==0) playerImg.setImage(rockImg);
        else if(playerHand==1) playerImg.setImage(scissorsImg);
        else playerImg.setImage(paperImg);

        //敵の画像セット
        int enemyHand = rand.nextInt(3);

        if(enemyHand==0) enemyImg.setImage(rockImg);
        else if(enemyHand==1) enemyImg.setImage(scissorsImg);
        else enemyImg.setImage(paperImg);

        //勝ち
        if((playerHand-enemyHand+3)%3==2){
            wonCnt++;
            wonCntNum.setText(wonCnt+"/30");
            battleMsg.setText("Win");
        }else if((playerHand+enemyHand+3)%3==1) battleMsg.setText("Lose");
        else battleMsg.setText("Draw");

        //パーセント計算
        percentLabel.setText((wonCnt*100/battleCnt)+"%");
    }

    void gameClear(){

    }
}

