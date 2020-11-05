package shape;
public abstract class AbsLine extends Shape {

	private int length;

	public AbsLine(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public void setLength(int len) {
		this.length = len;
	}
}
