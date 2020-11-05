package pkg1syou;

import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("文字列を入力してください→");
        String str = sc.nextLine();
        System.out.print("検索したい文字を入力してください→");
        String findStr = sc.nextLine();

        System.out.println("「"+findStr+"」は、"+(Integer.valueOf(str.indexOf(findStr))+1)+"番目にあります！");



    }
}
