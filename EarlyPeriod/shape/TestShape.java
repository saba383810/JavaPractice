package shape;

import java.awt.*;

public class TestShape {
    public static void main(String[] args) {
        Shape[] s = {
                new Point(),
                new FillRect(5,3),
                new FrameRect(5,5),
                new VirtLine(10),
                new HorizLine(3),
                new Triangle(3)
        };
        for(Shape qqq : s){
            qqq.print();

            if(qqq instanceof Shape && qqq.getArea()!=0){
                System.out.println("面積 : "+qqq.getArea());
                System.out.println();
            }
        }
    }
}
