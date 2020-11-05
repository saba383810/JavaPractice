package pkg2syou;

public class ExceptionExample4 {
    public static void main(String[] args) {
        try{
            int[] scores = new int[3];
            scores[0] = 50;
            scores[1] = 55;
            scores[2] = 70;
            scores[3] = 65;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("例外処理じゃい！");
        }
    }
}
