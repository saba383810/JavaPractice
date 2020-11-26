package pkg7syou;
import java.io.*;

class Point  {

	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Triangle implements Serializable  {

	private  static final long serialVersionUID =1L;
	Point p0;
	Point p1;
	Point p2;
}
