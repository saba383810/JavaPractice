package pet2;

public class VirtualBird extends VirtualPet {
    boolean canFly;
    //コンストラクタ
    VirtualBird(String name, int maxEnergy,int energy, boolean canFly){
        super(name, maxEnergy, energy);
        this.canFly=canFly;
        System.out.println(name+"という名前で犬を作成しました。");
    }
    //自己紹介メソッド
    void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("<"+this.name+"> 僕の名前は『"+this.name+"』だ、ぴよ！\n最大体力は『"+this.maxEnergy+"』、今の体力は『"+this.energy+"』だ、ぴよ！");

        if(canFly) System.out.println("ぼく、飛べるんだよ！");
        else System.out.println("ぼく、飛べない鳥・・・文句ある？");
        System.out.println("-------------------------------");
    }
    boolean bark(int cnt) {
        for (int i = 0; i < cnt; i++) {

            if (this.energy - 5 < 0) {
                this.energy = 0;
                System.out.println("・・・・・体力がなくて・・・もう・・吠えられない・・だ・・ぴよ・・");
                return false;
            }
            System.out.print("ぴよ!");
            this.energy -= 5;

        }
        System.out.println("\n-------------------------------");
        return true;
    }
}
