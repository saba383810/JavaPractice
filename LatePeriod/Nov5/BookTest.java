package Nov5;

import java.util.ArrayList;
import java.util.Collections;

public class BookTest {
    public static void main(String[] args) {
        ArrayList<Book> ar = new ArrayList<Book>();
        ar.add(new Book("banana",100));
        ar.add(new Book("carrot",300));
        ar.add(new Book("apple",100));
        ar.add(new Book("Daikon",400));
        ar.add(new Book("Egg",500));
        ar.add(new Book("Garlic",700));
        ar.add(new Book("Fruit",700));


        System.out.println("-----ソート前-----");
        for (Book b : ar) {
            System.out.println("タイトル:" +b.title+"  値段:"+b.price);
        }

        Collections.sort(ar);

        System.out.println("-----ソート後-----");
        for (Book b : ar)
            System.out.println("タイトル:" +b.title+"  値段:"+b.price);

    }
}
