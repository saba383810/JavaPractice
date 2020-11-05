package account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ATMメニューへようこそ！\n");


        Account a1 = new Account("さばと");
       // Account a2 = new Account("さばと2",400000);

        boolean isLoop = true;
        while(isLoop) {
            System.out.println("-------------------------------");
            System.out.print("何をしますか？\n1:引き出し 2:入金 3:残高確認  4:終了\n→");

            int n = scan.nextInt();
            System.out.println("-------------------------------");
            switch (n) {
                case 1:
                    System.out.print("何円引き出しますか？\n→");
                    int money = scan.nextInt();
                    System.out.println("-------------------------------");
                    a1.outMoney(money);
                    //if(a1.outMoney(money)) System.out.println("正常");
                    //else System.out.println("eroor");
                    break;
                case 2:
                    System.out.println("何円入金しますか？");
                    int deposit = scan.nextInt();
                    a1.inMoney(deposit);
                    break;

                case 3:
                    a1.show();
                    break;
                case 4:
                    isLoop =false;
                    break;
                default:
                    System.out.println("正しい数字(1~4)を入力ししてください。");

            }
        }

    }
}
