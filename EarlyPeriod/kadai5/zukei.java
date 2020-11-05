package kadai5;

import java.util.Scanner;

public class zukei {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----①----");
        for(int i=0;i<5;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("----②----");
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----③----");
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----④----");
        for(int i=0;i<=5;i++){
            for(int j=0;j<5-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----⑤----");
        for(int i=1;i<=5;i++){
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----kadai1----");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++) {
                for(int l=0;l<5;l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("----kadai2----");
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++) {
                if(i==0||i==6||j==0||j==6){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("----チャレンジ1----");
        System.out.print("横幅をにゅうりょくしてね → ");
        int width = scan.nextInt();
        System.out.print("縦幅をにゅうりょくしてね → ");
        int height = scan.nextInt();

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++) {
                if((i+j)%2==0){
                    System.out.print("*");

                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("----チャレンジ2----");
        System.out.print("横幅をにゅうりょくしてね → ");
        int width2 = scan.nextInt();
        System.out.print("縦幅をにゅうりょくしてね → ");
        int height2 = scan.nextInt();
        for(int i=0;i<height2;i++){
            if(i<height2/2){
                for(int j=0;j<i+1;j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < height2 - i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
