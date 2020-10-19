package enumhome;

import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HireOrFireTest {

    @Test
    void shouldHireEmploye() {
        //given
        List<Employee> employeeList = EmployeeListCreator.employeeListCreator();
        LocalDate dateOfBirth = LocalDate.of( 1985 , 2 , 5 );
        Footballer employee = new Footballer("Cristiano", "Ronaldo", dateOfBirth, 1_000_000.00,JobPosition.FOOTBALLER,1.85, 85, "Central striker", "Both");
        //when
        //List<Employee> result = HireOrFire.hire(employee, employeeList);
        List<Employee> result = HireOrFire.hire(employee, employeeList);
        //then
        assertThat(result).hasSize(1);
    }

    @Test
    void shouldFireEmploye() {
    }
}