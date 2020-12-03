package Dec3;

public class Rectangle {
    int width,height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    void printInfo(){
        System.out.println("四角形の幅と高さは("+width+","+height+")、外周は("+outCircle()+")です。");
    }
    int outCircle(){
        return (height+width)*2;
    }

}
