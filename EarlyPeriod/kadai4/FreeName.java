package kadai4;

import java.util.Scanner;

public class FreeName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("回数を入力してください: ");
        int n = scan.nextInt();

        System.out.print("名前を入力してください: ");
        String name = scan.next();

        System.out.print("何の倍数でアホになるか入力してください: ");
        int aho  = scan.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print(i+"回目 "+name);
            if(i%aho==0){
                System.out.print("っ");
            }
            System.out.println();
        }


    }
}
