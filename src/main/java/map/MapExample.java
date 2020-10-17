package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Long, String> map = new LinkedHashMap<>();

        map.put(1L, "Hobbit");
        map.put(2L, "Harry Potter");
        map.put(3L, "Wiedzmin");
        map.put(4L, "Ania z zielonego wzgórza");
        map.put(5L, "Dzieci z bullerbyn");
        map.put(1L, "Silimariilion");

        System.out.println("Klucze : ");

        for (Long key : map.keySet()) {
            System.out.println(key + " ");
        }

        System.out.println("\nWartości  : ");
        for (String value : map.values()) {
            System.out.println(value + " ");
        }

        System.out.println("Pary : ");
        for (Map.Entry<Long, String> entry : map.entrySet()) {
            System.out.println(entry);

            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
