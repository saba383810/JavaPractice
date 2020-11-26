package Nov5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class BookTest2 {
    public static void main(String[] args) {
        Random r = new Random();
        long start,end;
        ArrayList<Book> ar = new ArrayList<>();

        LinkedList<Book> link = new LinkedList<>();

        
        System.out.println("-----①-----");
        //------ArrayList-------
        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            ar.add(new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(array):"+(end-start)+"ms");

        //------LinkedList-------
        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            link.add(new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(Linked):"+(end-start)+"ms");


        System.out.println("-----②-----");
        //-----ArrayList
        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            ar.add(0,new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(array):"+(end-start)+"ms");


        //-----LinkedList
        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            link.add(0,new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(Linked):"+(end-start)+"ms");


        System.out.println("-----③-----");

        //-----ArrayList
        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            ar.add(0,new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(array):"+(end-start)+"ms");

        start = System.currentTimeMillis();

        for(int i=0;i<100000;i++)
            link.add(new Book("Book"+i,r.nextInt(1000)));

        end = System.currentTimeMillis();
        System.out.println("処理速度(Linked):"+(end-start)+"ms");


    }
}
