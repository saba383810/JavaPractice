package pet;

import java.security.AlgorithmParameterGenerator;

public class VirtualDog {
    String name;
    int maxEnergy;
    int energy;
    VirtualDog(){
        this(null,0,0);
    }
    VirtualDog(String name,int maxEnergy,int energy){
        this.name = name;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
    }
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
    void printInfo(){
        System.out.println("-------------------------------");
        System.out.println("<"+this.name+"> 僕の名前は『"+this.name+"』だ、ワン！\n最大体力は『"+this.maxEnergy+"』、今の体力は『"+this.energy+"』だ、ワン！U｡･ｪ･｡U");
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

    boolean bark(int cnt){
        for(int i=0;i<cnt;i++){

           if(this.energy-5<0){
                this.energy=0;
                System.out.println("わ・・・・・体力がなくて・・・もう・・吠えられない・・だ・・ワン・・");
                return false;
           }
            System.out.print("わん!");
           this.energy -=5;

        }
        System.out.println("\n-------------------------------");
        return true;
    }
    void spin(int cnt){
        for(int i=0;i<cnt;i++){

            if(this.energy-5<0){
                this.energy=0;
                System.out.println("<"+this.name+">つ・・疲れた・・ワン・・");
                break;
            }
            System.out.print("U｡･ｪ･｡U ｸﾙﾝｯ!");
            this.energy -=10;

        }
        System.out.println("\n-------------------------------");
    }

}
