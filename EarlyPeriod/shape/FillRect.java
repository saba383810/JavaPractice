package shape;

public class FillRect extends Rectangle implements plane2D {


    public FillRect(int width, int height) {
        super(width,height);
    }


    public String toString() {
        return "FrameRectクラスです("+super.getWidth()+","+super.getHeight()+")";
    }

    public void draw() {
        int vert = super.getHeight();
        int horiz = super.getWidth();
        for(int i = 0;i<vert;i++){
            for(int j=0;j<horiz;j++){
                System.out.print("■");
            }
            System.out.println();
        }
    }

    /**
     * @see plane2D#getArea()
     */
    public int getArea() {

        return super.getWidth()*super.getHeight();
    }
}
