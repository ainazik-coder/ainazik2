import java.util.*;

public class Task14 {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        boolean a = deque.offerFirst(1);
        boolean b = deque.offerLast(2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(deque);
    }
}