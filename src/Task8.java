import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(1);
        setB.add(2);

        if (setA.containsAll(setB)) {
            System.out.println("Set A contains all elements of set B");
        } else {
            System.out.println("Set A does not contain all elements of set B");
        }
    }
}