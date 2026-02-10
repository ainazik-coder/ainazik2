import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int n : numbers) {
            set.add(n);
        }

        System.out.println(set);
    }
}