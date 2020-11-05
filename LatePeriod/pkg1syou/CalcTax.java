package pkg1syou;

import java.util.Scanner;

public class CalcTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("税率(8%)の計算をします。");
        System.out.print("定価を入力してください→");
        float price = sc.nextFloat();
        System.out.println("税込み価格 : "+(int)Math.ceil(price*1.08)+"円");




    }
}
