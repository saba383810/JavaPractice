package pkg2syou;

import javax.sound.midi.SoundbankResource;

public class ExceptionExample3 {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        int c =0;

        try{
            c = a / b;
        }catch (ArithmeticException e){
            System.out.println("0での除算が行われたのでプログラムを停止します。");
            System.out.println(e);
            return;
        }
        System.out.println("cの値は" + c);
        System.out.println("処理を正常に終了します");
    }
}
