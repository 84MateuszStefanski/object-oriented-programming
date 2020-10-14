package structures.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(1);
        lista.add(2);
        lista.add(8);

        List<String> listaString = new ArrayList<>();

        listaString.add("Poniedziałek");
        listaString.add("Wtorek");
        listaString.add("Sroda");
        listaString.add("Czwartek");

       // listaString.remove("Sroda");
      //  listaString.remove(0);
        boolean result = listaString.remove("Czwartek");
        System.out.println(listaString);
        System.out.println(lista.size());
        System.out.println("Rozmiar listy stringów " + listaString.size());

        for (int i = 0; i < lista.size() ; i++) {
            System.out.println(lista.get(i) + " ");
        }

        for (String el : listaString) {
            System.out.println(el + " ");
        }

        System.out.println("\n ---------------------------------- ");

        Iterator<String> it = listaString.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+ " ");
        }

        System.out.println("\n ---------------------------------- ");

        listaString.forEach(el -> System.out.println(el + " "));







    }
}
