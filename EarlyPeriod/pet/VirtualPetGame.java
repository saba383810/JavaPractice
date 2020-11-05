package pet;

import account.Account;

import java.util.Scanner;

public class VirtualPetGame {
//    public static void showPet(VirtualDog pet){
//        System.out.println("-------------------------------------------");
//        System.out.println("【名前】"+pet.name);
//        System.out.println("【最大体力】"+pet.maxEnergy);
//        System.out.println("【現在の体力】"+pet.energy);
//
//    }
//    public static void showMaxEnergyPet(VirtualDog pet1,VirtualDog pet2){
//        if(pet1.maxEnergy < pet2.maxEnergy){
//            showPet(pet1);
//            System.out.println("最大体力は"+pet1.name+"より"+pet2.name+"の方が大きいよ");
//        }else if(pet1.maxEnergy  > pet2.maxEnergy){
//            showPet(pet2);
//            System.out.println("最大体力は"+pet2.name+"より"+pet1.name+"の方が大きいよ");
//        } else{
//            System.out.println("最大体力は"+pet1.name+"と"+pet2.name+"は同じだよ！");
//        }
//    }
//    public static VirtualDog getHungryPet(VirtualDog pet1 , VirtualDog pet2){
//        if(pet1.energy < pet2.energy) return pet1;       //pet1がの方が空いている
//        else if(pet1.energy > pet2.energy) return pet2;  //pet2がの方が空いている
//        else return new VirtualDog();                    //同じ
//    }


    public static void main(String[] args) {


//        VirtualDog jiro = new VirtualDog("ジロ",100,50);

//
//        showPet(taro);
//        System.out.println("-------------------------------------------");
//        showPet(jiro);
//        System.out.println("-------------------------------------------");
//
//        showMaxEnergyPet(taro,jiro);
//        VirtualDog vd = getHungryPet(taro,jiro);
//        if(vd.name == null) {
//            System.out.println("二人ともお腹の空き具合は一緒だよ！");
//        }else {
//            System.out.println("お腹が空いているのは" + vd.name);
//
//
//        }
        Scanner scan = new Scanner(System.in);
        System.out.println("バーチャルペットへようこそ！\n");
        System.out.print("早速ですが、あなたのペットに名前をつけてあげましょう！\n→");
        String name = scan.next();
        System.out.println("かわいいなまえですね！それではバーチャルペットの世界をご堪能あれ！");
        VirtualDog dog = new VirtualDog(name,100,50);
        System.out.println("-------------------------------");
        System.out.println("∪･ω･∪");
        System.out.println("ワンワン！よろしくワン！");
        System.out.println("-------------------------------");
        boolean isLoop = true;
        while(isLoop) {

            System.out.print("何をしますか？\n1:自己紹介 2:吠える 3:散歩  4:ご飯を食べる 5:スピン 6:終了\n→");
            int n = scan.nextInt();

            switch (n) {
                case 1:

                    dog.printInfo();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.print("何回吠えますか？(1回で体力を5使用。)\n→");
                    int barkCnt = scan.nextInt();
                    System.out.println("-------------------------------");
                    dog.bark(barkCnt);
                    break;

                case 3:
                    dog.walk();
                    break;
                case 4:
                    System.out.print("何個食べ物をあげますか？(1個で1回復)\n→");
                    int nokori = dog.eat(scan.nextInt());
                    if(nokori>0) System.out.println(nokori+"個残した。");
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    System.out.print("何回回転しますか？(1回で体力を10使用。)\n→");
                    int spinNum = scan.nextInt();
                    dog.spin(spinNum);
                    break;
                case 6:
                    isLoop =false;
                    break;
                default:
                    System.out.println("正しい数字(1~5)を入力ししてください。");

            }
        }

    }

}
