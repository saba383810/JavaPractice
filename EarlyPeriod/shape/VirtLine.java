package shape;
public class VirtLine extends AbsLine {

	public VirtLine(int length) {
		super(length);
	}

	public java.lang.String toString() {
		return "VirtLineクラスです。";
	}

	public void draw() {
		for (int i = 0;i<super.getLength();i++){
			System.out.println("|");
		}
	}
	public int getArea(){
		return 0;
	}

}
