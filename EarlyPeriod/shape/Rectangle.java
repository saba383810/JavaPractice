package shape;
public class Rectangle extends Shape implements plane2D {

	private int width;

	private int height;

	public Rectangle(int width, int height) {
		this.height =height;
		this.width = width;
	}

	public String toString() {
		return "Rectangleクラスです。";
	}

	public void draw() {

	}

	public int getHeight(){
		return this.height;
	}
	public int getWidth(){
		return this.width;
	}




	/**
	 * @see plane2D#getArea()
	 */
	public int getArea() {

		return this.height*this.width;
	}

}
