package pkg3syou;

public class Operator extends Thread {
    Souko souko;
    String name;
    int pickCnt;
    public Operator(Souko sk ,String name,int pickCnt){
        this.souko= sk;
        this.name = name;
        this.pickCnt = pickCnt;
    }
    synchronized public int picking(){
            int stock;
            stock = souko.pickStock(pickCnt);
            return stock;
    }
    public void run(){
        while(souko.getStock()>0) {

            System.out.println(name + "が、" + picking() + "個取り出して"+"のこり"+souko.getStock()+"個");
            try{sleep(100);}catch(Exception e){}
        }
    }
}
