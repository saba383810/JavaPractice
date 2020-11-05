package pet2;


import java.util.Scanner;

public class VirtualPetMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("バーチャルペットへようこそ！\n");

        System.out.print("何匹飼いますか？\n→");
        int petCnt = scan.nextInt();

        VirtualPet[] pets =new VirtualPet[petCnt];

        for (int i=1;i<=petCnt;i++){
            System.out.println(i+"匹目のペットを作成します。");
            System.out.print("種類はなににしますか？1:犬 2:鳥\n→");
            int petNum = scan.nextInt();
            if(petNum ==1){
                System.out.print("名前は何にしますか？\n→");
                String petName = scan.next();

                pets[i-1]= new VirtualDog(petName,100,50,"わん");

            }else if(petNum == 2){
                System.out.print("名前は何にしますか？\n→");
                String petName = scan.next();
                pets[i-1]= new VirtualBird(petName,100,50,true);
            }else{
                System.out.println("-----------------------");
                System.out.println("正しい値を入力してください！");
                System.out.println("-----------------------");
                i--;
            }
        }

        System.out.println("かわいいなまえですね！それではバーチャルペットの世界をご堪能あれ！");

        boolean isLoop = true;
        int petNum=0;
        while(isLoop) {

            boolean petCheck=true;
            while(petCheck) {
                System.out.print("何番目のペットとあそびますか？\n→");
                petNum = scan.nextInt();

                if (petCnt < petNum) {
                    petCheck = true;
                    System.out.println("-----------------------");
                    System.out.println("正しい値を入力してください！");
                    System.out.println("-----------------------");
                } else {petCheck = false;}
            }


            System.out.print("何をしますか？\n1:自己紹介 2:鳴く 3:散歩  4:ご飯を食べる 5:スピン 6:寝る\n→");
            int n = scan.nextInt();
            switch (n) {
                case 1:

                    pets[petNum-1].printInfo();
                    break;
                case 2:
                    System.out.println("-------------------------------");
                    System.out.print("何回吠えますか？(1回で体力を5使用。)\n→");
                    int barkCnt = scan.nextInt();
                    System.out.println("-------------------------------");
                    pets[petNum-1].bark(barkCnt);
                    break;

                case 3:
                    pets[petNum-1].walk();
                    break;
                case 4:
                    System.out.print("何個食べ物をあげますか？(1個で1回復)\n→");
                    int nokori = pets[petNum-1].eat(scan.nextInt());
                    if(nokori>0) System.out.println(nokori+"個残した。");
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    System.out.print("何回回転しますか？(1回で体力を10使用。)\n→");
                    int spinNum = scan.nextInt();
                    pets[petNum-1].spin(spinNum);
                    break;
                case 6:
                    pets[petNum-1].sleep();
                    break;
                default:
                    System.out.println("正しい数字(1~5)を入力ししてください。");
            }

            int  loopCheck=0;
            while(loopCheck!=1&&loopCheck!=2) {
                System.out.print("まだつづけますか？ 1:続ける 2:やめる\n→");
                loopCheck = scan.nextInt();
            }
            if(loopCheck==2)isLoop=false;
        }
    }
}
