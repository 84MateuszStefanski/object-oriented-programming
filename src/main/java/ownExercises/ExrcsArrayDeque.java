package ownExercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ExrcsArrayDeque {
    public static void main(String[] args) {
        Deque<String> listaDeque = new ArrayDeque<>();
        listaDeque.offerFirst("Jan");
        listaDeque.offerFirst("Marek");
        listaDeque.offerFirst("Lukasz");
        listaDeque.offerFirst("Mateusz");
        System.out.println(listaDeque);
        System.out.println(listaDeque.size());
        listaDeque.pollLast();
        System.out.println(listaDeque);

        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(13);
        numbers.offer(14);
        numbers.offer(15);
        System.out.println(numbers);
        System.out.println(numbers.element());
        numbers.poll();
        System.out.println(numbers);
        System.out.println(numbers.size());


    }
}
