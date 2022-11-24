package Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeArrayList= Arrays.asList(
                new Employee("Emp1","CS",15000),
                new Employee("Emp2","CS",18000),
                new Employee("Emp3","IT",21000),
                new Employee("Emp4","IT",25000)
        );

       Map<String,List<Employee>> bydepartment = employeeArrayList
                                                .stream()
                                                .collect(Collectors.groupingBy(e->e.getDepartment()));

        System.out.println(bydepartment);
    }

}
