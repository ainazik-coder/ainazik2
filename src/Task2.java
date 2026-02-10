import java.util.*;

public class Task2 {

    static HashSet<String> allowedUsers = new HashSet<>();

    public static boolean isAllowed(String name) {
        return allowedUsers.contains(name);
    }

    public static void main(String[] args) {
        allowedUsers.add("Aisha");
        allowedUsers.add("Tamerlan");
        allowedUsers.add("Kuduret");

        System.out.println(isAllowed("Tom"));
        System.out.println(isAllowed("John"));
    }
}