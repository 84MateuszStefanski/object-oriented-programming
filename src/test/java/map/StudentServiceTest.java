package map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class StudentServiceTest {

    @Test
    void shoudCalculateAverage() {
        //given
        List<Integer> studentsGradeList = Arrays.asList(1, 2, 3, 4, 5 );
        //when
        double result = StudentService.calculateAverage(studentsGradeList);

        //then
        assertThat(result).isEqualTo(3);
    }
    @Test
    void shouldCalculateTotalAverage() {
        //given
        Map<Student, List<Integer>> map = new LinkedHashMap<>();
        Student student1 = new Student("Pierwszy", "Student","Polish");
        List<Integer> studentsGradeList1 = Arrays.asList(1, 2, 3, 4, 5 );
        Student student2 = new Student("Drugi", "Studentt","Polish");
        List<Integer> studentsGradeList2 = Arrays.asList(5, 5, 3, 4, 5 );
        Student student3 = new Student("Trzeci", "Studenttt","Polish");
        List<Integer> studentsGradeList3 = Arrays.asList(5, 5, 5, 4, 5 );
        map.put(student1, studentsGradeList1);
        map.put(student2, studentsGradeList2);
        map.put(student3, studentsGradeList3);


        //when
        double result = StudentService.calculateTotalAverage(map);

        //then

        assertThat(result).isEqualTo(4.066666666666667);


    }

}