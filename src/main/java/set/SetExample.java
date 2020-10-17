package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
                                    //zbiory nie posiadaja indeksów
public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();  // set nie przechowuje duplikatów
                                            // hashset nie zachowuje kolejności dodawania elementów
        set.add("Artur");
        set.add("Janusz");
        set.add("Grażyna");
        set.add("Dzesika");
        set.add("Brajan");
        set.add("Artur");

        System.out.println(set);

        set = new LinkedHashSet<>();  // LinkedHashSet też nie przyjmuje duplikatów ale zachowuje kolejność wprowadzania
        set.add("Artur");
        set.add("Janusz");
        set.add("Grażyna");
        set.add("Dzesika");
        set.add("Brajan");
        set.add("Artur");

        System.out.println(set);

        set = new TreeSet<>();  // treeSet nie przyjmuje duplikatów ale sortuje alfabetycznie

        set.add("Artur");
        set.add("Janusz");
        set.add("Grażyna");
        set.add("Dzesika");
        set.add("Brajan");
        set.add("Artur");
        set.add("artur");

        System.out.println(set);






    }
}
