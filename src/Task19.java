import java.util.*;

public class Task19 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(5);
        deque.add(10);

        deque.clear();

        System.out.println(deque.peek());
        System.out.println(deque.isEmpty());
    }
}