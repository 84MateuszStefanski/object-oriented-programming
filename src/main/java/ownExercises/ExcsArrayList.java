package ownExercises;

import java.util.ArrayList;
import java.util.List;

public class ExcsArrayList {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(100);
        lista.add(1050);
        lista.add(100453);
        lista.add(10120);
        lista.add(21100);
        lista.add(10000);
        lista.add(30);

        System.out.println(lista);
        System.out.println(lista.size());

        lista.removeIf(el -> el % 2 == 0);

        System.out.println(lista.size());
        System.out.println(lista);

    }
}
