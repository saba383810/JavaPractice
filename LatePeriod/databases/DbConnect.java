package databases;

import java.sql.*;
public class DbConnect{
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
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("ID");
                System.out.println("id:" + id);
                String name = rs.getString("NAME");
                System.out.println("name:" + name);

                System.out.println("----------------");
            }

            sql = "INSERT INTO menu (name,price) VALUES (? , ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, "イチゴ");
            ps.setInt(2, 300);

            int result = ps.executeUpdate();

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