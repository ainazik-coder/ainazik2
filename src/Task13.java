import java.util.*;

public class Task13 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);

        for (int n : deque) {
            System.out.println(n);
        }
    }
}