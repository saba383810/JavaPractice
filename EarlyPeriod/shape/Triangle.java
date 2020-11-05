package shape;

public class Triangle extends Shape implements plane2D {

    private int size;
    public Triangle(int size){
        this.size =size;
    }

    public String toString(){
        return "Triangleクラスです("+this.size+")";
    }

    public void draw(){
        for(int i=1;i<size+1;i++){
            for(int j=0;j<i;j++){
                System.out.print("■");
            }
            System.out.println();
        }
    }


    /**
     * @see plane2D#getArea()
     */
    public int getArea() {
        return this.size*size/2;
    }
}
