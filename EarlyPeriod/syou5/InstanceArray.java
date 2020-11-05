package syou5;

import javax.sound.midi.SoundbankResource;

public class InstanceArray {
    public static void main(String[] args) {
        StudentCard[] cards = new StudentCard[3];
        cards[0] = new StudentCard();
//        cards[1] = new StudentCard();
//        cards[2] = new StudentCard();
        cards[0].id = 1234;
        cards[0].name = "鈴木太郎";
//        cards[1].id = 1235;
//        cards[1].name = "佐藤花子";
//        cards[2].id = 1236;
//        cards[2].name = "山田次郎";
//
//        for(int i=0;i<cards.length;i++)
//        {
//            System.out.println(cards[i].id);
//            System.out.println(cards[i].name);
//        }
        for (StudentCard hoge : cards)
        {
            if(hoge != null)
            {
                System.out.println(hoge.id);
                System.out.println(hoge.name);
            }
        }

    }
}
