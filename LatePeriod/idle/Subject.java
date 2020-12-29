package idle;

import java.util.ArrayList;

public abstract class Subject {

    private ArrayList<Observer> observers = new ArrayList<>(); // Observer たちを保持
    public void addObserver(Observer observer) { // Observer を追加
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) { // Observer を削除
        observers.remove(observer);
    }
    public void notifyObservers() { // Observer へ通知

        for(Observer o : observers){
            o.update(this);//登録された Observer 全員に通知
        }
    }

}
