package pkg1syou;

//文字列StringBuilderクラス・・・可変の文字列操作
//教科書にはないので、公式マニュアル
//https://docs.oracle.com/javase/jp/8/docs/api/java/lang/StringBuilder.html
//などで確認

class StringBuilderEx{
	public static void main ( String[] args ){
	
		//①文字列をどんどん繋げたい
		
		StringBuilder sb = new StringBuilder("This");
		//StringBuidersb= "This";	//注意！このように直接代入はできません
		//String str = "This"; 		//これはOK、String str　= new String("This");でもOK
		
		System.out.println(sb);
		
		//「This is a pen.」を目指す
		sb.append(" is");
		sb.append(" a");
		sb.append(" pen. ");
		System.out.println(sb);
		

		//④文字の一部を削除したい
		//最初の「This」を削除
		
		sb.delete(0,4);
		System.out.println(sb);
		
		//⑤文字を挿入したい
		//「That」を挿入
		
		sb.insert(0, "That");
		System.out.println(sb);
		
		
		//⑥文字を変更したい
		//pen →note
		
		sb.replace(10,13,"note");
		System.out.println(sb);
		
		//⑦反転したい
		
		sb.reverse();
		System.out.println(sb);
		
		
		//⑧Stringクラスに変換
		
		String str = sb.toString();
		System.out.println(str);
		
	}
	
}