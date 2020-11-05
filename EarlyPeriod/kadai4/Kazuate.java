package kadai4;

import java.util.Random;
import java.util.Scanner;

public class Kazuate {
    public static void main(String[] args) {
        //初期化
        Random r = new Random();
        int no = r.nextInt(100)+1;
        int num;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("数あてゲームへようこそ！");

        System.out.println("このゲームは私が用意した数字(1~100)をあなたに当ててもらいます！");

        System.out.println("それでは始めますよ！よーいどん！");

        for(int i=1;i<=10;i++) {
            System.out.println();

            //正しい数字が入力されるまでループ
            do {
                System.out.print("["+i + "回目]  数字(1~100)を入力してください :");

                num = scan.nextInt();

                if(num==999&& i==6&&flag==true){
                    //ヒントメッセージ(i=6の時一回のみ使用可能)
                    System.out.println("え〜〜。ヒント欲しいの〜〜？\nしょうがないな〜〜！\n1桁目の数字は　「"+no%10+"」　だよ！がんばってね！\n");
                    flag=false;
                }else if(num>100 || num<1){
                    //正しくない数字が入力されたときのメッセージ
                    System.out.println();
                    System.out.println("1~100の数字を入力してください！！！");
                    System.out.println();
                }
            }while(num>100 || num<1);
            if (no == num) {
                //正解のメッセージ
                System.out.println(i + "回目で正解！！すっごーーーい！");
                break;
            }else{
                //正解じゃない時のメッセージ
                System.out.print("うーん。。");
                if (no < num&&i!=10) {
                    System.out.println(num + "よりは小さいかも！");
                } else if (no > num &&i!=10) {
                    System.out.println(num + "よりは大きいかも！");
                } else {
                    System.out.println("正解は「"+no+"」だったよ。わたしのかちだね！" );
                }
                if(i==5){
                    //ヒントを入力で切るメッセージ
                    System.out.println();
                    System.out.println("難しかったかな？ヒントが必要だったら999って入力してね！");
                }
            }
        }
        System.out.println("\n遊んでくれてありがとう！また挑戦してね！");
    }
}
