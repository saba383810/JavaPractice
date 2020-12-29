package number;
//グラフ表示クラス（オブザーバーの立場）
//数値に応じて、＊マーク（横)で表す

//Digitクラスを参考にして、作りましょう
public class GraphObserver implements Observer {

    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        for(int i =0;i<generator.getNumber();i++){
            System.out.print("*");
        }
        System.out.println();

    }


}
