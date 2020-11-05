package pkg1syou;

import java.util.Scanner;

public class BilderChallenge {
    public static void main(String[] args) {

        String inStr ="first";

        StringBuilder ansStr = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------");
        System.out.println("キーボードから入力した文字列をどんどんつなげて行きます！");
        System.out.println("-----------------");
//        while(inStr!="quit"){
//            System.out.print("追加する文字列(quitで終了)→");
//            inStr = sc.next();
//            if(inStr == "quit") break;
//            ansStr.append(inStr+" ");
//        }
        System.out.println("完成した文字列は"+ansStr);
        inStr ="second";

        System.out.println("-----------------");
        System.out.println("キーボードから入力した文字を削除します。");
        System.out.println("-----------------");
        while(inStr !="quit"){
            System.out.print("削除する文字列(quitで終了)→");
            inStr =sc.next();
            while(ansStr.indexOf(inStr)!=-1) {
                ansStr.delete(ansStr.indexOf(inStr), ansStr.indexOf(inStr) + 1);
            }
        }
    }
}
