package databases;

import java.sql.*;
import java.util.Scanner;

public class DbInsert {
    public static void main(String args[]){
        final String DRIVER_NAME = "org.h2.Driver";
        final String JDBC_URL =
                "jdbc:h2:tcp://localhost/~/test;AUTO_SERVER=TRUE"; //DB 名
        final String DB_USER = "saba";//ユーザ名
        final String DB_PASS = "pass";//パスワード
        Connection con = null;

        PreparedStatement ps= null; //SQL 文を格納するクラス
        ResultSet rs = null; //結果を格納するクラス

        try{
            Class.forName(DRIVER_NAME); // JDBC ドライバを読み込み
// データベースへ接続
            con = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
            if(con != null) System.out.println("DB 接続成功！");
            else System.out.println("DB 接続失敗・・・・");

            //接続成功の後に追加
            String sql ="SELECT * FROM MENU";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // SELECT を実行
            Scanner sc = new Scanner(System.in);
            sql = "INSERT INTO menu (name,price) VALUES (? , ?)";
            ps = con.prepareStatement(sql);
            System.out.println("果物を追加します！");
            System.out.print("追加する名前→");
            String addName =  sc.next();
            System.out.print("価格→");
            int addPrice = sc.nextInt();
            ps.setString(1, addName);
            ps.setInt(2, addPrice);

            int result = ps.executeUpdate();
            System.out.println("現在のテーブル状況");

            sql ="SELECT * FROM MENU";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("------------select文------------");
            while (rs.next()) { // レコード数分
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int price = rs.getInt("PRICE");
                System.out.print("id:" + id);
                System.out.print("\tname:" + name);
                System.out.println("\tPRICE:" + price);

                System.out.println("--------------------------------");
            }


        }catch(SQLException e) {
            System.err.println("SQL の例外発生：" + e);
        }catch(Exception e){
            System.err.println("例外発生：" + e);
            e.printStackTrace();
        }finally{
            if(con != null) try{con.close();}catch(SQLException e){ e.printStackTrace(); }
        }
    }
}
