package syou4;

import javax.sound.midi.SoundbankResource;

public class Method21 {

    static void printHello() {
        System.out.println("鯖戸 健太");

    }
    static void printPI() {
        System.out.println(Math.PI);
    }
    static void printRandomMessage(){
        int n = (int)(3 * Math.random());
        if(n==0){
            System.out.println("こんばんは");
        }else if(n==1){
            System.out.println("こんにちは");
        }else{
            System.out.println("おはよう");
        }
    }
    static void printMessage(String message) {
        System.out.println(message);
    }
    static void printCircleArea(double radius){
        System.out.println(radius*radius*Math.PI);
    }
    static void printRandomMessage(String name){
        int n = (int)(3 * Math.random());
        if(n==0){
            System.out.println(name+"さんこんばんは");
        }else if(n==1){
            System.out.println("こんにちは"+name+"さん");
        }else{
            System.out.println("おはよう"+name+"さん");
        }
    }
    static void printMessage(String message , int count) {
        for(int i=0;i<count;i++){
            if(i!=0) System.out.print(" ");
            System.out.print(message);
        }
        System.out.println();
    }
    static void printRectangleArea(double height, double width){
        System.out.println(height*width);
    }
    static void printMaxValue(double a, double b, double c){
        double max= a;
        if(max <b) max = b;
        if(max <c) max = c;
        System.out.println(max);
    }
    static String getMessage(){
        return "よろしくお願いします";
    }
    static String getWeatherForecast(){
        int rand1 = (int)(3 * Math.random());
        int rand2 = (int)(4 * Math.random());
        String str="";

        if(rand1==0){
            str += "今日の天気は";
        }else if(rand1==1){
            str += "明日の天気は";
        }else{
            str += "明後日の天気は";
        }
        if(rand2==0){
            str += "晴でしょう";
        }else if(rand2==1){
            str += "曇りでしょう";
        }else if(rand2==2){
            str += "雨でしょう";
        }else{
            str += "雪でしょう";
        }
        return  str;
    }
    static double getSquareRootOf2(){
        double d = Math.sqrt(2.0);
        return d;

    }

    static String getRandomMessage2(String name){
        int n = (int)(3 * Math.random());
        String str ="";
        if(n==0){
            str = name+"さんこんばんは";
        }else if(n==1){
            str = "こんにちは"+name+"さん";
        }else{
            str = "おはよう"+name+"さん";
        }
        return str;
    }
    static double  getAbsoluteValue(double value){
        if(value<0) value *= -1;
        return value;
    }
    static boolean isEvenNumber(int value){
        if(value%2==0){
            return true;
        }else{
            return false;
        }
    }
    static double getMinValue(double a,double b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    static boolean isSameAbsoluteValue(int i,int j){
        if(i==j || -i==j || i==-j){

            return true;
        }else{
            return false;
        }
    }
    static String getMessage(String name,boolean isKid){
        String message="";
        if(isKid) {
            message += name + "ちゃん。こんにちは！";
        }else {
            message += name + "さん。こんにちは！";
        }
        return message;
    }
    static float getMinValue(float[] array){
        float min= array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i])min = array[i];
        }
        return min;
    }

    static double getAverage(float [] array){
        float sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    static String getLongestString(String[] array){
        int maxStrLen = 0;
        for (int i=1;i<array.length;i++){
            if(array[i-1].length()<=array[i].length()) maxStrLen = i;
        }
        return array[maxStrLen];
    }
    //main処理
    public static void main(String[] args) {

        System.out.print("問題1 :");
        printHello();

        System.out.println();

        System.out.print("問題2 :");
        printPI();

        System.out.println();

        System.out.print("問題3 :");
        printRandomMessage();

        System.out.println();

        System.out.print("問題4 :");
        printMessage("Hello!");

        System.out.println();

        System.out.print("問題5 :");
        printCircleArea(2.0);

        System.out.println();

        System.out.print("問題6 :");
        printRandomMessage("さばと");

        System.out.println();

        System.out.print("問題7 :");
        printMessage("Hello!",3);

        System.out.println();

        System.out.print("問題8 :");
        printRectangleArea(10,10);

        System.out.println();

        System.out.print("問題9 :");
        printMaxValue(10,11,14);

        System.out.println();

        System.out.println("問題10 :"+getMessage());

        System.out.println();

        System.out.println("問題11 :"+getWeatherForecast());

        System.out.println();

        System.out.println("問題12 :"+getSquareRootOf2());

        System.out.println();

        System.out.println("問題13 :" + getRandomMessage2("さばと"));

        System.out.println();

        System.out.println("問題14 (テスト1):-3.6 → " + getAbsoluteValue(-3.6) );
        System.out.println("問題14 (テスト2):5.2 → " + getAbsoluteValue(5.2) );


        System.out.println();

        System.out.println("問題15 (テスト1):6 → " +isEvenNumber(6));
        System.out.println("問題15 (テスト2):5 → " +isEvenNumber(5));

        System.out.println();

        System.out.println("問題16 :" +getMinValue(2,3));

        System.out.println();

        System.out.println("問題17 (テスト1):1,-1 → " +isSameAbsoluteValue(1,-1));
        System.out.println("問題17 (テスト2):2,2 → " +isSameAbsoluteValue(2,2));
        System.out.println("問題17 (テスト3):5,-3 → " +isSameAbsoluteValue(5,-3));

        System.out.println();

        System.out.println("問題18 (テスト1):" + getMessage("さばと",true));
        System.out.println("問題18 (テスト2):" + getMessage("さばと",false));

        System.out.println();

        float[] arr={10,2,4,100,-4};
        System.out.println("問題19 :["+arr[0]+" , "+arr[1]+" , "+arr[2]+" , "+arr[3]+" , "+arr[4]+"}のうち一番小さいのは"+ getMinValue(arr));

        System.out.println();

        System.out.println("問題20 ["+arr[0]+" , "+arr[1]+" , "+arr[2]+" , "+arr[3]+" , "+arr[4]+"}の平均値は"+ getAverage(arr));

        System.out.println();

        String[] array ={"sabato","HelloWorld","My name is Sabato.","My name is Tanaka."};
        System.out.println("問題21 :[ "+array[0]+" , "+array[1]+" , "+array[2]+" , "+array[3]+"]のなかで長い文字列は" + getLongestString(array));



    }
}
