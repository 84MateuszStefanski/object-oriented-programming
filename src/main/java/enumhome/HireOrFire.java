package enumhome;

import java.util.List;

public class HireOrFire {

    public static List<Employee> hire(Employee employee, List<Employee> employeeList) {
       employeeList.add(employee);
        return employeeList;
    }

    public static List<Employee> fire(Employee employee, List<Employee> employeeList) {
        employeeList.remove(employee);
        return employeeList;
    }


}
