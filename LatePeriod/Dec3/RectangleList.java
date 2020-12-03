package Dec3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RectangleList {
    public static void main(String[] args) {
        List<Rectangle> list = Arrays.asList(
                new Rectangle(1,2),
                new Rectangle(2,3),
                new Rectangle(3,4),
                new Rectangle(4,5),
                new Rectangle(5,6)
        );
        System.out.println("(1)全部表示します");
        list.stream().forEach(s->s.printInfo());
        System.out.println();

        System.out.println("(2)外周が10以上だけ表示します。");
        list.stream().filter(s->s.outCircle()>=10).forEach(s->s.printInfo());
        System.out.println();

        System.out.println("(3)外周が10以上だけ降順表示します。");
        list.stream().filter(s->s.outCircle()>=10).sorted((s0,s1)->s1.outCircle()-s0.outCircle()).forEach(s->s.printInfo());
        System.out.println();

        System.out.println("(4)幅だけ取り出し、3以下のものだけ、昇順で、System.out.printで表示");
        list.stream().filter(s->s.width <=3).sorted((s0,s1)->s0.width-s1.width).forEach(s-> System.out.println(s.width));

    }
}
