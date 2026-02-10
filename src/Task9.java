import java.util.*;

public class Task9 {
    public static void main(String[] args) {

        String sentence = "I have three cats and one dog";
        String[] words = sentence.split(" ");

        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            set.add(word);
        }

        System.out.println(set);
    }
}