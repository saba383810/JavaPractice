package idle;

import java.util.Scanner;

public class Idle extends Subject {
    String name;
    String message;
    Scanner sc = new Scanner(System.in);
    Idle(String name){
        this.name = name;
    }
    public void move() {

        for(;;) {
            System.out.printf("%s のメッセージ:", name);
            message = sc.next();
            notifyObservers(); //観測者（ファン）に通知する


        }
    }

}
