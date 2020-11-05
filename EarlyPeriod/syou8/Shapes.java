package syou8;

//抽象クラスの定義（p239）
//Shapeクラスを親クラスとして、Polyline、Rectangle、Circleクラスがある
//Shapeクラスはただ、まとめるため（ポリモフィズム）のクラス→抽象クラスに位置付ける


//追加するクラス（p246)
//Polylineを継承したPolygonクラス（多角形）
//面積を求められるクラス（Polygon,Rectangle、Circle）は
//面積インタフェース（HasGetAreaMethod)を実装する
abstract class Shape{
	abstract void draw();
	
}

class Polyline extends Shape{
	void draw(){
		System.out.println("N");
	}
}

class Rectangle extends Shape implements HasGetAreaMethod{
	void draw(){
		System.out.println("□");
	}
	@Override
	public double getArea() {
		System.out.println("RectangleのgetArea()がよばれた");
		return 0;
	}
}

class Circle extends Shape implements HasGetAreaMethod{
	void draw(){
		System.out.println("○");
	}
	@Override
	public double getArea() {
		System.out.println("CircleのgetArea()がよばれた");
		return 0;
	}
}
class Polygon extends Polyline implements HasGetAreaMethod{

	@Override
	public double getArea() {
		System.out.println("PolygonのgetArea()がよばれた");
		return 0;
	}
}
