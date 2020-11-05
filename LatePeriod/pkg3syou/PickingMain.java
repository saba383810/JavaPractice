package pkg3syou;

public class PickingMain {
   public static void main(String[] args) {
        //倉庫インスタンス生成、例えば在庫数は10で作成
        Souko sk = new Souko(10);
        //オペレータ2人、引数は、倉庫、名前、運べる数、
        Operator a = new Operator(sk, "★サザエ", 1);
       // Operator b = new Operator(sk, "☆マスオ", 2);
        //作業開始(スレッドスタート) //二人の作業が終わったら、終了メッセージ
        a.start();
       // b.start();
        try{
           a.join();
         // b.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("全ての作業が終了しました");
    }
}
