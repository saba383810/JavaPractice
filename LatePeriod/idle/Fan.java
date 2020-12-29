package idle;

public class Fan implements Observer{
    @Override
    public void update(Subject s) {
        System.out.println("-----Subjectからの通知-----");
        Idle i = ((Idle)s);
        System.out.println(i.name+"が「"+i.message+"」と言っている♪\n");

        if(i.message.equals("a")){
            System.out.println("「a」はguraちゃんの伝説の初配信のセリフだね！\n");

        }else if(i.message.length()<10){
            System.out.println("10文字以上にしましょう！");

        }
    }
}
