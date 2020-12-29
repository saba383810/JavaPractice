package idle;

public class Main {
    public static void main(String[] args) {
        Idle gura = new Idle("Guraちゃん");
        Fan fan1 = new Fan();
        gura.addObserver(fan1);
        gura.move();
    }
}
