package shape;
public class Point extends Shape {

	public String toString() {
		return "点クラスです";
	}

	public void draw() {
		System.out.println("・");
	}
	public int getArea(){
		return 0;
	}
}
