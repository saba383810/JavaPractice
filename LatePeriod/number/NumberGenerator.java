package number;

//対象者のインタフェース
import java.util.ArrayList;
import java.util.Iterator;
	
//数値ジェネレーター
public abstract class NumberGenerator{
	
	// Observerたちを保持
	private ArrayList<Observer> observers = new ArrayList<>();
	
	// Observerを追加
	public void addObserver(Observer observer) {	
		observers.add(observer);
	}
	// Observerを削除
	public void deleteObserver(Observer observer) { 
		observers.remove(observer);
	}
	// Observerへ通知
	public void notifyObservers() {			   
		for(Observer o : observers){
			o.update(this);
		}
	}
	public abstract int getNumber();// 数を取得する
	public abstract void execute();	// 数を生成する
}
