package syou3;
//リテラル（数字や文字、全ての値）について
class Literal{

	public static void main (String[] args){
	
		//整数（20億以下）
		int i = 30;
		System.out.println("整数iは" + i);
		
		i=0xA;	//16進数　10進数なら「１０」
		i=013;	//8進数　１０進数なら「１１」
		
		//大きい整数
		long l = 30000000000L;
		System.out.println("整数lは" + l);
		;
		//実数（
		double d = 30.5;
		System.out.println(d);
		
		float f = 30.5F;
		System.out.println(f);
		
		//文字
		char c = '花';
		
		//「\500」と表示する
		System.out.println("全部で\\500です");
		
	
	}

}