package builder;


import singleton.SingleGirl;

public class Main {
    public static void main(String[] args) {
        //[plain],[html]
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            Director director = new Director(htmlbuilder);
            director.construct();
            String filename = htmlbuilder.getResult();
            System.out.println(filename + "が作成されました。");
            //gui残骸
//        } else if(args[0].equals("gui")){
//            FXBuilder fxBuilder  = new FXBuilder();
//            Director director = new Director(fxBuilder);
//            director.construct();

        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage:プレーンテキストで文書作成の場合、引数は「plain」");
        System.out.println("Usage:HTMLファイルで文書作成の場合、引数は「html」");
    }

}
