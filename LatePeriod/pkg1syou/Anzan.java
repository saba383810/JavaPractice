package pkg1syou;

import java.util.Random;
import java.util.Scanner;

public class Anzan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("暗算タイム！");
        System.out.print("準備ができたら、[Enter]を押してね・・・");
        String s = sc.nextLine();

        long t1 = System.currentTimeMillis();


        int a,b,ans,curCnt =0;

        Random r = new Random();
        for(int i=1;i<=5;i++){

            a = r.nextInt(9)+1;
            b = r.nextInt(9)+1;
            System.out.print("("+i+") "+a+" + "+ b +" = ");
            ans = sc.nextInt();
            if(ans != a+b) {
                System.out.println("残念！答えは" + (Integer.valueOf(a) + Integer.valueOf(b)) + "だよ！\nまたチャレンジしてね！");
                return;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("**********************");
        System.out.println("タイムは"+((t2-t1)*0.001)+"秒でした。");
    }
}
