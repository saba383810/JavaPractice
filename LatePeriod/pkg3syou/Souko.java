package pkg3syou;

public class Souko {

    private int stock;

    public Souko(int stock){

        this.stock =stock;
    }
    public int getStock(){

        return stock;
    }
    synchronized public int pickStock(int num){

        if(this.stock>=num) {
            this.stock -= num;
            return num;
        }else{
            int amari = num-this.stock;
            this.stock =0;
            return amari;
        }
    }
}
