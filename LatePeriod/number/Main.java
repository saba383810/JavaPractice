package number;
//Mainクラス

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int genNum =0;
        NumberGenerator  generator;

        Scanner sc = new Scanner(System.in);
        boolean genLoop = true;
        while(genLoop) {
            System.out.print("RandomGeneratorの場合は1,IncreaseGeneratorの場合は2を入力してください : ");
            try {
                genNum = sc.nextInt();
                if(genNum==1||genNum==2)break;
            } catch (Exception e) {
                sc.next();
            }finally {
                System.out.println("正しい数字を入力してください！");

            }
        }
        //random対象者インスタンス生成
        if(genNum==1) {
            generator = new RandomNumberGenerator();

        }else{
            generator = new IncreaseGenerator();
        }
    	//オブザーバー（観測者）作成、DigitObserverとGraphObserver
        DigitObserver d = new DigitObserver();
        GraphObserver g = new GraphObserver();
    	//対象者にオブザーバーを登録
        generator.addObserver(d);
        generator.addObserver(g);
    	//対象者、行動開始
        generator.execute();
    }
}
