package syou6;

import java.util.Scanner;

class Area {
    static double rect(double height, double width) {
        return width * height;
    }

    static double circle(double r) {
        return r * r * Math.PI;
    }

    static double triangle(double bottom, double height) {
        return bottom * height / 2;
    }

    static double trape(double top, double bottom, double height) {
        return (top + bottom) * height / 2;
    }
}
public class TestArea{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isLoop=true;
        while(isLoop) {
            System.out.print("図形の面積を求めます。どの図形の面積を求めますか？\n1:四角形 2:円 3:三角形 4:台形\n→");
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    System.out.print("縦の長さを入力してください。→");
                    int rectHeight = scan.nextInt();
                    System.out.print("横の長さを入力してください。→");
                    int rectWidth = scan.nextInt();
                    System.out.println("面積 : "+Area.rect(rectHeight,rectWidth));
                    isLoop = false;
                    break;
                case 2:
                    System.out.print("半径の長さを入力してください。→");
                    int circleR = scan.nextInt();
                    System.out.println("面積 : "+Area.circle(circleR));
                    isLoop = false;
                    break;
                case 3:
                    System.out.print("底辺の長さを入力してください。→");
                    int triangleBottom = scan.nextInt();
                    System.out.print("高さを入力してください。→");
                    int triangleHeight = scan.nextInt();
                    System.out.println("面積 : "+Area.triangle(triangleBottom,triangleHeight));
                    isLoop = false;
                    break;

                case 4:
                    System.out.print("上底の長さを入力してください。→");
                    int trapeUpper = scan.nextInt();
                    System.out.print("下底の長さを入力してください。→");
                    int trapeBottom = scan.nextInt();
                    System.out.print("高さを入力してください。→");
                    int trapeHeight = scan.nextInt();
                    System.out.println("面積 : "+Area.trape(trapeUpper,trapeBottom,trapeHeight));
                    isLoop = false;
                    break;

                default:
                    System.out.println("1~4の数字を入力してください。");
            }
        }

    }
}


