package pkg5syou;
import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		//バージョン９から廃止されている
		//integerList.add(new Integer(50));
		//integerList.add(new Integer(100));

		integerList.add(50);
		integerList.add(100);

//		Integer integer0 = integerList.get(0);
//		Integer integer1 = integerList.get(1);
//		int i0 = integer0.intValue();
//		int i1 = integer1.intValue();
		int i0 = integerList.get(0);
		int i1 = integerList.get(1);

		System.out.println(i0);
		System.out.println(i1);
		

	}
}
