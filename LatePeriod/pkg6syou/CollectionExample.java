package pkg6syou;
import java.util.ArrayList;

//前回学習した「コレクションフレームワーク」
//ArraiListを使って座標リスト（Pointクラスの配列）を扱う

//拡張For文で扱っている処理→ラムダ式で実現してみよう（より短いプログラム）

//座標クラス
class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void printInfo() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}

//実行クラス
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(0, 8));
		pointList.add(new Point(1, 6));
		pointList.add(new Point(2, 9));
		pointList.add(new Point(3, 3));

		//拡張forで、繰り返す
		for (Point p : pointList) {
			p.x *= 2;
			p.y *= 2;
		}
		//拡張forで、繰り返す
		for (Point p : pointList) {
			p.printInfo();
		}
		System.out.println("--------------");
		//上の２つのfor文を、ラムダ式のforEachメソッドで書いてみよう
		
		//pointList.forEach(p->{p.x*=2;p.y*=2;});



		//xとy入れ替え
//		for (Point p : pointList) {
//			int tmp;
//			tmp = p.x;
//			p.x = p.y;
//			p.y = tmp;
//		}

		//sort

		pointList.sort((p0,p1)->p0.y- p1.y);

		for (Point p : pointList) {
			p.printInfo();
		}

		
	}
}