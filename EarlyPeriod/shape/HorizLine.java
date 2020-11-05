package shape;
public class HorizLine extends AbsLine {

	public HorizLine(int length) {
		super(length);
	}

	public String toString() {
		return "HorizLineクラスです("+super.getLength()+")";
	}

	public void draw() {
		for (int i = 0;i<super.getLength();i++){
			System.out.print("-");
		}
		System.out.println();
	}
	public int getArea(){
		return 0;
	}
}
