package structures.list.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {
    public static void main(String[] args) {

        // kolejka

        Queue<String> queue = new ArrayDeque<>();

        queue.offer("A");  // offer wklada element do kolejnki
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue.poll()); // metoda poll usuwa element  z kolejki
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek()); // metoda peek pokazuje element ale go nie usuwa


        //stos

        Deque<String> stack = new ArrayDeque<>();

        stack.push("A");  // push uklada na stosie
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.pop());   // pop zdejmuje ostatni element ze stosu

    }
}
