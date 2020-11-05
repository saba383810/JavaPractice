package accoutnt2;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        OrdinaryAccount a1 = new OrdinaryAccount("さばと");

        a1.show();

        a1.outMoney(1000);

        a1.inMoney(10000);

        a1.show();

        CurrentAccount a2 = new CurrentAccount("TCB","東京中央銀行");

        a2.show();

        a2.inMoney(20000);

        a2.show();
    }
}
