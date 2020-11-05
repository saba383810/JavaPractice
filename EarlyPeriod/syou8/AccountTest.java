package syou8;

//Accountクラスを使って動作するクラス
/*
 * ※以下、このファイルではなく、Acount.javaを修正していく
 * ①Accountクラスのフィールドをカプセル化する
 * ②残高を参照したい（getterの作成）
 * ③名義を変更したい（setterの作成）
 */

public class AccountTest{
		
	public static void main(String[] args){
		
		//口座開設（自分の口座）
		Account a1 = new Account("円堂守",100000 );
		//情報表示
		a1.show();
		//引き出し
		a1.outMoney(5000);
		//情報表示
		a1.show();
		
		//不正な操作・・・残高を勝手に増やす
		a1.setBalance(10000000);
		a1.show();
		
		//残高を参照したい・・・
		
		//最新口座番号を参照したい・・・・
		
	}
}