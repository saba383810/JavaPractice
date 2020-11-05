package pkg2syou;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionWarizan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRoop =true;
        while(isRoop ==true) {
            System.out.println("数字を入力してください");
            try {
                System.out.print("割られる数→");
                int a = sc.nextInt();
                System.out.print("割る数→");
                int b = sc.nextInt();
                int ans = a / b;
                isRoop = false;

            } catch (ArithmeticException e) {
                System.out.println("0で割っちゃだめだよ！！");
                sc.next();
            } catch (InputMismatchException e) {
                System.out.println("ちゃんと数字を入力してね！");
                sc.next();
            }
        }

    }
}
