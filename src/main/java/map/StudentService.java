package map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentService {


    public static double calculateAverage(List<Integer>grades) {
        double sum = 0;
        double average = 0;
        for (Integer grade : grades) {
             sum += grade;
             average = sum / grades.size();
        }
        return average;
    }

    public static double calculateTotalAverage(Map<Student, List<Integer>> studentToGrades) {
        double sum = 0;
        double average = 0;
//        for (Integer entry : studentToGrades.entrySet()) {
//           sum += entry;
//           average = sum / studentToGrades.size();
//        }

        return average;
    }
}
