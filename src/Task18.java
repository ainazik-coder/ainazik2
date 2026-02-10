import java.util.*;

public class Task18 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        System.out.println(deque.size());
        System.out.println(deque.isEmpty());

        deque.add(1);
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());

        deque.poll();
        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
    }
}
