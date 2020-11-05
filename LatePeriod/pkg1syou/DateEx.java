package pkg1syou;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//日付のAPIを利用しよう（なぜか教科書にはのっていない）
//公式apiドキュメント等で、自分で調べていってください

//時間の計算・表示はシステムにはかかせない機能
//代表的なクラス、メソッドを使ってみましょう

//System.cullentTimeMillis()メソッド（今の時間をlong型で取得、つまり計算しやすい）
//Dateクラス
//Calendarクラス
//SimpleDateFormatクラス（表示用）

//内容を理解したら、自分の誕生日を曜日付きで出してみよう

class DateEx{
	public static void main ( String[] args ){
		
		//現在の時刻をlongで取得
		String str ="a";
		long t1 = System.currentTimeMillis();

		long t2 = System.currentTimeMillis();
		
		//経過時間を計測する
		System.out.println(t2-t1);
		
		
		//もっと細かく経過時間を計測するのもある(System.nanoTime()メソッド)

		t1 = System.nanoTime();
		t2 = System.nanoTime();
		System.out.println(t2-t1);

		
		//現在の日時を知ろう（PCのシステム時刻）Dateクラス  (少し古いクラス）
		Date d = new Date();
		System.out.println(d);

		//扱いやすいint型で、年、月、日、時、分、秒を扱う、Calendarクラス（おすすめ）
		Calendar c =Calendar.getInstance();//シングルトンパターン
		
		//現在時刻の「年」をintで取り出す
		int year  = c.get(Calendar.YEAR);
		System.out.println(year);
		
		//○年○月○日・・など、文字で見やすい表記にする SimpleDateFormatクラス 
		SimpleDateFormat f = new SimpleDateFormat("yy年MM月dd日です");
		String s = f.format(c.getTime());	//上記書式を使って、ある日付を文字列にする
		System.out.println(s);
		
		
		//応用編、和暦を出したいとき
		Locale.setDefault(new Locale("ja","JP","JP"));
		f = new SimpleDateFormat("Gyy年");
		s = f.format(d);
		System.out.println(s);
		

		//自分の誕生日、表示してみよう
		//c.set（年、月、日）で、カレンダーにセットできる
		c.set(2000,8,26);
		f = new SimpleDateFormat("Gyy年MM月dd日(E曜日)ですよ♪");
		s = f.format(c.getTime());	//上記書式を使って、ある日付を文字列にする
		System.out.println(s);
		

	}
}
