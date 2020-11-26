package Nov12;

import java.io.*;
import java.util.Scanner;

public class FIleCopy {
    public static void main(String[] args) {
        boolean isLoop = true;

        String fileName1 ="",fileName2="",s="";
        boolean isReverse =false,isUpper=false,isReplace=false,isAddCopy=false;
        String replaceChar ="",replacedChar="";

        Scanner sc = new Scanner(System.in);
        //コピー元ファイルオープン
        System.out.println("ファイルをコピーします！");
        while (isLoop ==true) {

            System.out.print("コピー元ファイル名→");
            fileName1 = sc.next();
            File file1 = new File(fileName1);

            //ファイルがあるかチェック

            if (!file1.exists()) {
                System.out.println("--------------------");
                System.out.println("「"+ fileName1+"」は存在しません。\nもう一度入力してください。");
                System.out.println("--------------------");
            }
            else  isLoop = false;
        }

        //コピー先ファイルオープン
        try {
            System.out.print("コピー先ファイル名→");
            fileName2 = sc.next();
            //コピー元ファイル
            File file1 = new File(fileName1);
            FileReader fr = new FileReader(file1);
            BufferedReader br = new BufferedReader(fr);

            //ファイルがすでに存在するなら上書きの確認
            if (file1.exists()) {
                System.out.println("--------------------");
                s ="";
                while(!s.equals("y") && !s.equals("n")) {
                    System.out.print("同じ名前のファイル存在します。上書きしますか？(y/n)→");
                    s = sc.next();
                }
                System.out.println("--------------------");
                if(s.equals("n")){
                    System.out.println("プログラムを終了します。");
                    return;
                }
            }
            //追加コピー
            s ="";
            while(!s.equals("y") && !s.equals("n")) {
                System.out.print("コピー先ファイルに追加コピーしますか？(y/n)→");
                s = sc.next();
            }
            if(s.equals("y")) isAddCopy =true;



            //文字置換
            s ="";
            while(!s.equals("y") && !s.equals("n")) {
                System.out.print("文字置換しますか？(y/n)→");
                s = sc.next();
            }
            if(s.equals("y")) {
                isReplace = true;
                System.out.print("置換元→");
                replaceChar = sc.next();
                System.out.print("置換先→");
                replacedChar = sc.next();

            }


            //行内文字列を反転
            s ="";
            while(!s.equals("y") && !s.equals("n")) {
                System.out.print("行内文字列を反転しますか？(y/n)→");
                s = sc.next();
            }
            if(s.equals("y")) isReverse =true;


            //大文字変換
            s ="";
            while(!s.equals("y") && !s.equals("n")) {
                System.out.print("大文字変換しますか？(y/n)→");
                s = sc.next();
            }
            if(s.equals("y")) isUpper =true;




            //コピー先ファイル
            File file = new File(fileName2);
            FileWriter fw;
            if(isAddCopy) {
                fw = new FileWriter(file,true);
            }else{
                fw = new FileWriter(file);
            }
            BufferedWriter bw = new BufferedWriter(fw);

            String lineData;
            //書き込み
            while((lineData = br.readLine()) != null) {
                //置換
                if(isReplace){
                    lineData =lineData.replace(replaceChar,replacedChar);
                }
                //アッパーキャメルにする
                if (isUpper) {
                    lineData = lineData.toUpperCase();
                }
                //反転する
                if(isReverse){
                    StringBuffer str = new StringBuffer(lineData);
                    str.reverse();
                    lineData = str.toString();
                }

                bw.write(lineData);
                bw.newLine();
            }
            br.close();
            bw.close();
        }catch (IOException e) {
            System.out.println("エラーが発生しました.プログラムを終了します。");
            System.out.println(e);
        }catch (Exception e){
            System.out.println("予期せぬエラーが発生しました.プログラムを終了します。");
            System.out.println(e);
        }
        System.out.println("--------------------");
        System.out.println("コピーが終了しました。おつかれさまでした。");
    }
}
