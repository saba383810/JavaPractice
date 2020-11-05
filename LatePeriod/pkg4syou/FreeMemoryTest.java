package pkg4syou;

//ヒープ領域のメモリ変化を確認するプログラム
//追記して、完成しよう
class DataSet {
	int[] data = new int[1000];	//４Kバイトを使う
}

public class FreeMemoryTest {
	public static void main(String[] args) {
		
		//現在のメモリ取得（Runtime.getRuntime().freeMemory()メソッド）
		//それを表示
		long mem = Runtime.getRuntime().freeMemory();
		System.out.println(mem);
		//DataSetクラスを使って、メモリ消費をする
		DataSet[] data = new DataSet[10000];

		for (int i = 0; i < 10000; i++) {
			data[i] = new DataSet();
			if ( i  % 100 == 0) {
				//現在のメモリを表示する
				long mem2 = Runtime.getRuntime().freeMemory();
				System.out.println(mem+"("+(mem-mem2)+")");
				mem=mem2;

			}
		}
	}
}
