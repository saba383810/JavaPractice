package pkg1syou;

//Stringは連結してはいけない！！！メモリも食うし、非常に遅い。
//javaプログラマの常識

public class StringBuilderHayai {

	public static void main(String[] args) {
		
			// StringBuilderを使って連結
			long t1 = System.currentTimeMillis();
			System.out.println("StringBuilderクラスで100000回、appendで連結");
			StringBuilder sb = new  StringBuilder();
			for(int i = 0; i < 100000; i++) {
				sb.append("Hello");
			}
			long t2 = System.currentTimeMillis();
			System.out.println("StringBuilderの結果（ミリ秒）:" + (t2 - t1));
			
			// Stringの「＋」を使って連結		→遅い
			t1 = System.currentTimeMillis();
			System.out.println("Stringクラスで100000回、＋で連結");
			String str="";
			for(int i = 0; i < 100000; i++) {
				str+="Hello";
			}
			t2 = System.currentTimeMillis();
			System.out.println("Stringの結果（ミリ秒）:" + (t2 - t1));
						

			
	}

}
