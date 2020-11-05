package pet2;

public class VirtualDog extends VirtualPet{
    String barkVoice;

    VirtualDog(String name,int maxEnergy,int energy,String voice){
        super(name,maxEnergy,energy);
        this.barkVoice = voice;
    }
    void printInfo(){
        System.out.println("-------------------------------");
        System.out.println("<"+this.name+"> 僕の名前は『"+this.name+"』だ、ワン！\n最大体力は『"+this.maxEnergy+"』、今の体力は『"+this.energy+"』だ、ワン！U｡･ｪ･｡U");
        System.out.println("-------------------------------");
    }


    boolean bark(int cnt) {
        for (int i = 0; i < cnt; i++) {

            if (this.energy - 5 < 0) {
                this.energy = 0;
                System.out.println("・・・・・体力がなくて・・・もう・・吠えられない・・だ・・" + barkVoice + "・・");
                return false;
            }
            System.out.print(this.barkVoice + "!");
            this.energy -= 5;

        }
        System.out.println("\n-------------------------------");
        return true;
    }

}
