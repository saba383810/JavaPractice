package account;

public class Account {
    String  no;
    String name;
    int balance;
    static int lastNo=0;

    Account(String name){
        lastNo++;
        String str = String.format("%04d",lastNo);
        this.no = str;
        this.name = name;
        this.balance = 10000;
        System.out.println("口座開設手数料として頂いていた「10000円」を口座に入金しました。");
        System.out.println(this.name+"さん。口座開設ありがとうございます！\n下記個人情報になります。");
        show();
    }

    void Account (String no,String name ,int balanace){


    }
    void inMoney(int money){
        if(money>0) {
            this.balance += money;
            System.out.println(money + "円入金しました。");
            show();
        }else{
            System.out.println("入金できませんでした。");
            System.out.println("0より大きい数字を入力してください。");
            show();
        }
    }
    boolean outMoney(int money){
        if(this.balance >= money){
            this.balance -= money;
            System.out.println(money+"円引き出しました。");
            show();
            return true;
        }else{
            System.out.println("残高不足です。引き出しができません。");
            show();
            return false;
        }
    }
    void show(){
        System.out.println("-------------------------------");
        System.out.println("番号 : "+this.no);
        System.out.println("名前 : "+this.name);
        System.out.println("残高 : "+this.balance);
        System.out.println("-------------------------------");

    }
}
