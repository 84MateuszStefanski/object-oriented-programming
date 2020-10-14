package structures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zadanie1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random() ;
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(11);   // napełnianie listy randomem
            list.add(num);
        }
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {    // usuwanie z listy liczb parzystych pętlą
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
            }
        System.out.println(list);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            if (it.next() % 2 ==0) {  // usuwanie liczb parzystych iteratorem
                it.remove();
            }
        }
        System.out.println(list);

        list.removeIf(el -> el %2 ==0);  // usuwanie liczb parzystych metoda removeIf

        System.out.println(list);



    }
}
