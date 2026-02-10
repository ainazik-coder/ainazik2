import java.util.*;

public class Task4 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Ainazik");
        names.add("Sarah");
        names.add("Maksut");
        names.add("Jibek");
        names.add("Aisulu");

        boolean removed = names.remove("Max");

        System.out.println(removed);
        System.out.println(names);
    }
}