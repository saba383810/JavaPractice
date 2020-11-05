package syou6;

class Rectangle{
    //フィールド
    int width;
    int height;

    //コンストラクタ
    public Rectangle(int width ,int height){
        this.width = width;
        this.height = height;
    }
    //メソッド
    public int getArea(){
        return width * height;
    }
    public boolean isLarger(Rectangle rect){
        if(this.getArea()>rect.getArea()) return true;
        else return false;
    }
}

public class TestRectangle {

    public static void main(String[] args) {
        //四角形のインスタンスを作る。
        Rectangle rect1 = new Rectangle(50,60);
        Rectangle rect2 = new Rectangle(40,80);

        if(rect1.isLarger(rect2)) System.out.println("rect1の方が面積が大きい");
        else System.out.println("rect2の方が面積が大きい");
    }
}
