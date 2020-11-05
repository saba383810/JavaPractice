package kadai3;

import java.io.IOException;
import java.util.Scanner;

public class Eword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("アルファベット→");
        String str = scan.next();

     /* 初期案

        int word = 0;
        try {
            word = System.in.read();
        } catch (IOException e) {
            System.err.println( "入力エラーです。" );
        }
       */


        switch (str.charAt(0)){
            case 'a':
                System.out.println("apple");
                break;
            case 'b':
                System.out.println("banana");
                break;
            case 'c':
                System.out.println("coconut");
                break;
            case 'd':
                System.out.println("doughnut");
                break;
            case 'e':
                System.out.println("eggplant");
                break;
            case 'f':
                System.out.println("Fruit");
            default:
                System.out.println("準備中です。");


        }



    }
}
