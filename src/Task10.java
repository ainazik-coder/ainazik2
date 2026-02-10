
import java.util.*;

public class Task10 {
    public static void main(String[] args) {

        String[] words = {"Pineapple", "apple", "KIWI", "Orange"};

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word.toLowerCase());
        }

        System.out.println(set);
    }
}