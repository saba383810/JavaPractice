package syou8;

//---------------------------
//口座クラス
//---------------------------

class Account{
	//フィールド
	static int lastNo=0;	//最新の口座番号
	private String name;	//名義
	private String no;		//口座番号
	private int balance;	//残高

	//デフォルトコンストラクタ
	Account(){
		this("ダミー", 0);
	}
	//名前と初回入金額（残高）を指定するコンストラクタ
	Account(String name,  int balance){
		System.out.println("------------------------------");
		System.out.printf("%s様、開設ありがとうございます\n", name);
		System.out.println("------------------------------");
		this.name = name;
		this.balance = balance;
		this.no = String.format("%04d",++lastNo );
	}
	//名前だけ指定するコンストラクタ
	Account(String name){
		this(name, 0);
	}
	
	//メソッド
	void inMoney(int money){	//入金
		balance += money;
		System.out.printf("%s様、%d円 入金しました。\n", name,money);
		
	}
	
	boolean outMoney(int money) { // 出金
		if (balance < money) {
			System.out.printf("%s様、残高不足です、引き出しは無効です\n", name);
			return false;
		} else {
			balance -= money;
			System.out.printf("%s様、%d円 引き出しました\n", name, money);
			return true;
		}
	}

	void show() { // 情報表示
		System.out.println("【口座番号】" + this.no);
		System.out.println("【お名前】" + this.name + " 様");
		System.out.println("【残高】" + this.balance + "円\n");
	}
	//ゲッター
	int getBalance(){
		return balance;
	}
	//セッター
	void setBalance(int balance){
		this.balance = balance;
	}

	public void setName(String name){

	}

}

