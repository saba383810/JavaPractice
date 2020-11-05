package Nov5;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("hello World");
        list.add("hello Java");





        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

        for(String hoge :list)
            System.out.println(hoge);
    }

}
