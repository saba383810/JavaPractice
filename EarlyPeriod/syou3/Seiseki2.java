package syou3;

import java.util.*;

class Seiseki2 {
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
		
	}
}
		