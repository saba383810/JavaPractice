package kadai4;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.print("正の数をを入力してください: ");
        num = scan.nextInt();
        }while(num<0);
        System.out.println("OKです！");

    }
}
