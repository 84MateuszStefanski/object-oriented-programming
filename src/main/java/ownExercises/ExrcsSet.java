package ownExercises;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExrcsSet {

    public static void main(String[] args) {
        Set<Integer> newSet = new HashSet<>();

        newSet.add(123);
        System.out.println(newSet.isEmpty());
        newSet.forEach(System.out::println);
        newSet.add(111);
        newSet.add(1);
        newSet.add(23);
        newSet.add(-99);
        newSet.add(21);
        newSet.add(44);
        newSet.forEach(System.out::println);
        System.out.println("rozmiar seta " + newSet.size());
        System.out.println(newSet.contains(44));
        newSet.remove(44);
        System.out.println("rozmiar seta po odjeciu " + newSet.size());

        Set<Integer> numbersSet = new LinkedHashSet<>();
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(1); // Dodanie elementu o wartości który już istnieje - element NIE jest ponownie dodany
        numbersSet.forEach(System.out::println);

        Set<Integer> numbersSetTree = new TreeSet<>();
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(2);
        numbersSet.add(1); // Dodanie elementu o wartości, który już istnieje - element NIE jest ponownie dodany
        numbersSet.forEach(System.out::println);
    }
}
