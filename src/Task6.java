import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);

        setA.removeAll(setB);

        System.out.println(setA);
    }
}