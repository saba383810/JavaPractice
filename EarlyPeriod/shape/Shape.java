package shape;
public abstract class Shape {

	public abstract String toString();

	public abstract void draw();
	public abstract  int getArea();

	public void print() {
		System.out.println("【"+toString()+"】");
		draw();
		System.out.println();
	}


}
