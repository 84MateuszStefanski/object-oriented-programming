package enumhome;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of( 1985 , 2 , 5 );
        Footballer newWorker = new Footballer("Cristiano", "Ronaldo", dateOfBirth, 1_000_000.00,JobPosition.FOOTBALLER,1.85, 85, "Central striker", "Both");
        List<Employee> employeeList = EmployeeListCreator.employeeListCreator();
        HireOrFire.hire(newWorker, employeeList);
        System.out.println(employeeList);


    }
}
