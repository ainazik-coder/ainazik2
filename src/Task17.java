import java.util.*;

public class Task17 {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.add("a");
        deque.add("b");
        deque.add("c");
        deque.add("b");
        deque.add("a");

        deque.removeFirstOccurrence("b");
        System.out.println(deque);

        deque.removeLastOccurrence("a");
        System.out.println(deque);
    }
}