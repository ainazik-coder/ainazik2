import java.util.*;

public class Task20 {
    public static void main(String[] args) {

        String word = "level";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}