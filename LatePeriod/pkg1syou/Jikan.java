package pkg1syou;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jikan {
    public static void main(String[] args) {
        Calendar c =Calendar.getInstance();
        c.set(2000,8,26);
        SimpleDateFormat f = new SimpleDateFormat("さばとの誕生日はyyyy年MM月dd日(E曜日)ですよ♪");
        String s = f.format(c.getTime());	//上記書式を使って、ある日付を文字列にする
        System.out.println(s);
    }
}
