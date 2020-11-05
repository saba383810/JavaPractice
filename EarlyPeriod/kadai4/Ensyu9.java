package kadai4;

public class Ensyu9 {
    public static void main(String[] args) {
        //1~100までの偶数の合計
        int sum =0;
        for(int i=2;i<=100;i=i+2){
            sum+=i;
        }
        System.out.println("①1~100までの偶数の合計は"+sum);

        //1~100までの奇数の合計
        sum=0;
        for(int i=0;i<100;i++){
            if((i%2==0 || i%3==0) && i%12!=0){
                sum+=i;
            }
        }
        System.out.println("②1〜100までの2または3の倍数で12の倍数でない合計は"+sum);

        //xの値を-10から10まで1ずつ変化させたときの次の式の値を求めるx^2
        for(int i=-10;i<=10;i++ ){
            sum=0;
            sum =(i*i)-(2*i)+1;
            System.out.println("("+i+")"+sum);

        }

    }
}
