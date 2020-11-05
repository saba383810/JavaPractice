package pet2;

public abstract class VirtualPet {
    String name;
    int maxEnergy;
    int energy;
    static int counter =0;
    VirtualPet(String name,int maxEnergy,int energy){
        this.name = name;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        System.out.printf("バーチャルペット[%d] %sちゃん誕生\n", ++counter,name);
    }

    void printInfo(){
    }
    abstract boolean bark(int cnt);

    void sleep(){
        System.out.println("<"+this.name+"> ん〜〜〜。よくねた！体力が全回復したよ！");
        this.energy = this.maxEnergy;
    }
    void walk(){
        System.out.println("-------------------------------");
        if(this.energy>=10){
            System.out.println("Uo･ｪ･oUﾉε==3トコトコ....");
            this.energy -= 10;
        }else{
            System.out.println("<"+this.name+">もう歩けないよ...");
        }
        System.out.println("-------------------------------");
    }

    int eat(int val){
        System.out.println("-------------------------------");
        if(this.energy<maxEnergy) {
            System.out.println("<"+this.name+">もぐもぐ・・・おいしい！U｡･ｪ･｡U");
            this.energy += val;
            if(this.energy>maxEnergy){
                System.out.println("<"+this.name+">もぐもぐ・・もうたべられないよ・・・(のこした。)");
                int nokori = this.energy - maxEnergy;
                this.energy -=nokori;
                System.out.println("-------------------------------");
                return nokori;
            }
            else{
                System.out.println("-------------------------------");
                return 0;
            }

        }else{
            System.out.println("<"+this.name+">お腹いっぱいでたべられないよ・・・U｡･ｪ･｡U");
            System.out.println("-------------------------------");
            return val;
        }
    }
    void spin(int cnt){
        for(int i=0;i<cnt;i++){

            if(this.energy-5<0){
                this.energy=0;
                System.out.println("<"+this.name+">つ・・疲れた・・・・");
                break;
            }
            System.out.print("U｡･ｪ･｡U ｸﾙﾝｯ!");
            this.energy -=10;
        }
        System.out.println("\n-------------------------------");
    }
}
