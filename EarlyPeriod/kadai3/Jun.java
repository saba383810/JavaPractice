package kadai3;

import java.util.Scanner;

public class Jun {
    public static void main(String[] args) {
        int month=0, day=0;
        Scanner scan = new Scanner(System.in);

        while(month > 12 || month < 1) {
            System.out.print("月→");
            month = scan.nextInt();
            if(month > 12 || month < 1) {
                System.out.println("入力が間違っています。もう一度入力してください。");
            }
        }
        while(day >31 || day<1) {
            System.out.print("日→");
            day = scan.nextInt();
            if(day >31 || day<1) {
                System.out.println("入力が間違っています。もう一度入力してください。)");
            }
        }
        if (day <= 10) {
            System.out.println(month+"月"+day + "日は"+ month + "月の初旬です！");
        } else if (day <= 20) {
            System.out.println(month+"月"+day + "日は"+ month + "月の中旬です！");
        } else {
            System.out.println(month+"月"+day + "日は" + month +"月の下旬です！");
        }
    }
}
