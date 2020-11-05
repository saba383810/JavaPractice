package accoutnt2;

import javax.swing.*;

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
        System.out.println(this.name+"さん。口座開設ありがとうございます！");
        System.out.println("口座開設手数料として頂いていた「10000円」を口座に入金しました。");
        System.out.println("下記が個人情報になります。");

    }

    void inMoney(int money){
        if(money>0) {
            this.balance += money;
            System.out.println(money + "円入金しました。");
        }else{
            System.out.println("入金できませんでした。");
            System.out.println("0より大きい数字を入力してください。");
        }
    }

    void show(){

        System.out.println("口座番号 : "+this.no);
        System.out.println("名前 : "+this.name);
        System.out.println("残高 : "+this.balance);
        System.out.println("-------------------------------");


    }
}
class OrdinaryAccount extends Account{

    OrdinaryAccount(String name) {

        super(name);
    }

    boolean outMoney(int money){
        if(this.balance >= money){
            this.balance -= money;
            System.out.println(money+"円引き出しました。");
            return true;
        }else{
            System.out.println("残高不足です。引き出しができません。");
            return false;
        }

    }
    void show(){
        System.out.println("-------------------------------");
        super.show();
    }
}


class CurrentAccount extends Account{

    String companyId;
    CurrentAccount(String companyId, String name) {
        super(name);
        this.companyId = companyId;
    }
    void show(){
        System.out.println("-------------------------------");
        System.out.println("会社コード : "+this.companyId);
        super.show();
    }
}