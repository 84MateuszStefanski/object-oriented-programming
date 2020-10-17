package map;

import java.util.*;

public class Zadanie4 {

    public static void main(String[] args) {

        Map<Student, List<Integer>> map = new LinkedHashMap<>();

        Student student1 = new Student("Jan", "Kowalski","PL");

        List<Integer> student1GradeList = new ArrayList<>();
        student1GradeList.add(5);
        student1GradeList.add(5);
        student1GradeList.add(5);
        student1GradeList.add(5);
        student1GradeList.add(5);

        map.put(student1, student1GradeList);

        System.out.println(map);

        for (Map.Entry<Student, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Student student2 = new Student("Janusz", "Palikot","Hebrajski");
        List<Integer> student2GradeList = Arrays.asList(1, 2, 3, 4, 5 );
        map.put(student2, student2GradeList);


        for (Map.Entry<Student, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Student student3 = new Student("Jan", "Kulczyk","Martwy");
        List<Integer> student3GradeList = Arrays.asList(5, 2, 4, 4, 5 );
        map.put(student3, student3GradeList);

        for (Map.Entry<Student, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.put(new Student("Janina", "Kulos","Angielski"),
               Arrays.asList(2, 2, 3, 4, 3));
        System.out.println("-----------------------Pełna lista studentów ------------------");
        for (Map.Entry<Student, List<Integer>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}
