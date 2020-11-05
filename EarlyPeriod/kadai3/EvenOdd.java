package kadai3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("整数→");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0) {
            System.out.println(num + "は偶数です!");
        }else{
            System.out.println(num + "は奇数です!");
        }

    }
}
