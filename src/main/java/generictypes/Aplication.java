package generictypes;

import java.util.*;


public class Aplication {

    public static void main(String[] args) throws Exception {

        MyStack<Integer> integerStack = new MyStack<>();
        MyStack<String> stringMyStack = new MyStack<>();

        String a = "a";
        stringMyStack.push(a);

        int b = 2;
        integerStack.push(b);

        List<String> list = new ArrayList<>();
        list.add("z");
        list.add("b");
        list.add("s");
        list.add("w");
        list.add("c");
        System.out.println(list);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(33);
        ints.add(432);
        ints.add(3);

        System.out.println(ints);
        //sortowanie od najmniejszego do największego inta
        Collections.sort(ints);
        System.out.println(ints);
        //sortowanie od największego do najmniejszego inta
        Collections.reverse(ints);
        System.out.println(ints);

        List<Employe> users = Arrays.asList(
                new Employe("Piotr", 20),
                new Employe("Jan", 23),
                new Employe("Janina", 53),
                new Employe("Andrzej", 33));

        Collections.sort(users);

        for (final Employe user : users) {
            System.out.println(user);
        }

        users.getClass();
        System.out.println("Wydruk po users.getClass");
        System.out.println(users);


    }

}
