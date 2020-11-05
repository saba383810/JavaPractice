package Nov5;

import java.util.LinkedList;

public class FE_h26_toi7 {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        LinkedList<String> queue = new LinkedList<>();

        stack.push("a");
        stack.push("b");
        queue.add(stack.pop());
        queue.add("c");
        stack.push("d");
        stack.push(queue.poll());
        String x = stack.pop();
        System.out.println(x);

    }
}
