package shape;

public class FrameRect extends Rectangle implements plane2D {


    public FrameRect(int width, int height) {
        super(width,height);
    }

    public String toString() {
        return "FillRectクラスです("+super.getWidth()+","+super.getHeight()+")";
    }

    public void draw() {
        int vert = super.getHeight();
        int horiz = super.getWidth();
        for (int i=0;i<vert;i++){
            for(int j=0;j<horiz;j++){
                if(i==0 || j==0 || i==vert-1 || j== horiz-1){
                    System.out.print("■");
                }else{
                    System.out.print("□");
                }
            }
            System.out.println();
        }
    }

    /**
     * @see plane2D#getArea()
     */
    public int getArea() {

        return super.getHeight()*super.getWidth();
    }
}
