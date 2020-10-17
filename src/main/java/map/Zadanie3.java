package map;

import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {
    public static void main(String[] args) {

        Map<Long, String> user = new HashMap<>();
        user.put(1L, "Aaron");
        user.put(2L, "Janina");
        user.put(3L, "Barbara");
        user.put(4L, "Alicja");
        user.put(5L, "Karol");
        user.put(6L, "Jacek");
        user.put(7L, "Jan");
        user.put(8L, "Jan");
        user.put(9L, "Jan");

        for (String name : user.values()) {
           if (name.startsWith("A")) {
               System.out.println(name);
           }
        }

        for (Map.Entry<Long, String> entry : user.entrySet()) {
            if (entry.getValue().equals("Jan")) {
                System.out.println(entry.getKey());
            }
        }
    }
}
