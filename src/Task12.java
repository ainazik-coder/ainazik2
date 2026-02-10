import java.util.*;

public class Task12 {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}