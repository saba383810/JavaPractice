package kadai5;

import java.util.Random;
import java.util.Scanner;

public class Seiseki {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.print("人数は→");
        int ninzu = s.nextInt();


        System.out.print("科目数は→");
        int kamoku = s.nextInt();

        //二次元配列で成績を扱う
        int[][] seiseki = new int[ninzu][kamoku];

        //個人ごと、科目ごとの合計を保存する配列
        int[] kojin_sum = new int[ninzu];
        int[] kamoku_sum = new int[kamoku];

        //データ入力
        System.out.println("データを入力してください");
        for(int i = 0; i < seiseki.length; i++){
            System.out.println((i+1) + "人目 ");
            for(int j = 0; j < seiseki[i].length; j++){
                System.out.print("【科目 " + (j+1) + "】");
                seiseki[i ][ j ] = s.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<seiseki.length;i++) {
            for (int j = 0; j < seiseki[i].length; j++) {
                kojin_sum[i] = kojin_sum[i] + seiseki[i][j];
                kamoku_sum[j] = kamoku_sum[j] + seiseki[i][j];

            }
        }
        //表示
        System.out.println("\n-------------------");
        System.out.println("全データ表示");

        for(int i = 0; i < seiseki.length; i++){
            System.out.printf("【%d人目】",i+1);
            for(int j = 0; j < seiseki[i].length; j++){
                System.out.printf("%5d", seiseki[i][j]);
            }
            System.out.println();
        }

        System.out.println("個人ごとの合計と(平均)");
        for(int i = 0; i < seiseki.length; i++){
            System.out.printf("【%d人目】%5d (%d)\n",i+1,kojin_sum[i],kojin_sum[i]/seiseki[0].length);
        }
        System.out.println("\n科目ごとの合計と(平均)");
        for(int i = 0; i < seiseki[0].length; i++){
            System.out.printf("【科目%d】%5d (%d)\n",i+1,kamoku_sum[i],kamoku_sum[i]/seiseki[0].length);
        }

//        //個人合計平均
//        System.out.println("\n-------------------");
//        System.out.println("個人ごとの合計と平均");
//        for(int i = 0; i < seiseki.length; i++){
//            int sum=0;
//            System.out.printf("【%d人目】",i+1);
//            for(int j = 0; j < seiseki[i].length; j++){
//                sum =sum +seiseki[i][j];
//            }
//            System.out.println(sum+" ("+(sum/seiseki[0].length)+")");
//        }
//
//        //科目の合計と平均
//        System.out.println("\n-------------------");
//        System.out.println("科目ごとの合計と平均");
//        for(int i = 0; i < seiseki.length; i++){
//            int sum=0;
//            System.out.printf("【%d科目】",i+1);
//            for(int j = 0; j < seiseki[i].length; j++){
//                sum =sum +seiseki[j][i];
//            }
//            System.out.println(sum+" ("+(sum/seiseki[0].length)+")");
//        }
    }
}
