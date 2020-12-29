package databases;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.sql.*;
import java.util.SimpleTimeZone;

public class DbTableView extends Application {
    private Label label;
    private TableView<Menu> tView;
    @Override
    public void start(Stage primaryStage) throws Exception {
        //DB関連

        final String DRIVER_NAME = "org.h2.Driver";
        final String JDBC_URL =
                "jdbc:h2:tcp://localhost/~/test;AUTO_SERVER=TRUE"; //DB 名
        final String DB_USER = "saba";
        final String DB_PASS = "pass";
        Connection con = null;

        PreparedStatement ps= null;
        ResultSet rs = null;

        label = new Label("menuテーブルの表示");
        //テーブルビューの作成
        tView = new TableView<>();
        //テーブルビューの列を作成
        TableColumn<Menu, String> tColumn1 = new TableColumn<>("ID");
        TableColumn<Menu, String> tColumn2 = new TableColumn<>("名前");
        TableColumn<Menu, String> tColumn3 = new TableColumn<>("価格");
        TableColumn<Menu, String> tColumn4 = new TableColumn<>("作成日");

        //列にデータクラスのプロパティを関連付ける
        tColumn1.setCellValueFactory(new PropertyValueFactory<>("id"));
        tColumn2.setCellValueFactory(new PropertyValueFactory<>("name"));
        tColumn3.setCellValueFactory(new PropertyValueFactory<>("price"));
        tColumn4.setCellValueFactory(new PropertyValueFactory<>("date"));
        //テーブルビューのデータ作成
        ObservableList<Menu> oList = FXCollections.observableArrayList();

        try{
            Class.forName(DRIVER_NAME); // JDBC ドライバを読み込み
            // データベースへ接続
            con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            if(con != null) System.out.println("DB 接続成功！");
            else System.out.println("DB 接続失敗・・・・");

            //接続成功の後に追加
            String sql ="SELECT * FROM MENU";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                System.out.println("id:" + id);
                String name = rs.getString("NAME");
                System.out.println("name:" + name);
                int price = rs.getInt("PRICE");
                System.out.println("price:" + price);
                Timestamp date = rs.getTimestamp("LAST_UPDATE");
                System.out.println("date:" + date);

                System.out.println("----------------");

                oList.add(new Menu(id,name,price,date));
            }

        }catch(SQLException e) {
            System.err.println("SQL の例外発生：" + e);
        }catch(Exception e){
            System.err.println("例外発生：" + e);
            e.printStackTrace();
        }finally{
            if(con != null) try{con.close();}catch(SQLException e){ e.printStackTrace(); }
        }



        //テーブルビューの列の設定
        tView.getColumns().add(tColumn1);
        tView.getColumns().add(tColumn2);
        tView.getColumns().add(tColumn3);
        tView.getColumns().add(tColumn4);
        //テーブルビューにデータを格納
        tView.setItems(oList);
        BorderPane bPane = new BorderPane();
        bPane.setTop(label);
        bPane.setCenter(tView);
        Scene scene = new Scene(bPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("メリークリスマス！");
        primaryStage.show();
    }

    //テーブルのデータを表すクラス
    public class Menu{
        //Propertyのサブクラス型である〇〇フィールド（プロパティ）
        private final SimpleIntegerProperty id;
        private final SimpleStringProperty name;
        private final SimpleIntegerProperty price;
        private final SimpleStringProperty date;
        public Menu(int id, String name, int price, Timestamp date){
            //プロパティに値をセットするコンストラクタ
            this.id = new SimpleIntegerProperty(id);
            this.name = new SimpleStringProperty(name);
            this.price = new SimpleIntegerProperty(price);
            this.date = new SimpleStringProperty(date.toString());

        }

        //以下〇〇Property()と言う名のメソッドを定義
        public IntegerProperty idProperty(){
            return id;
        }
        public StringProperty nameProperty(){
            return name;
        }
        public IntegerProperty priceProperty(){
            return price;
        }
        public StringProperty dateProperty(){
            return date;

        }
    }
    public static void main(String[] args) {
        launch();
    }
}
