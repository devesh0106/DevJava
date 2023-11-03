/*

import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public double getSalary() {
        return salary;
    }

    public Practice(int empId, String empName, String deptName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
        this.salary = salary;
    }

    private int empId;
    private String empName;
    private String deptName;
    private double salary;

    public static void main(String[] args) {
        List<Practice> ls = Arrays.asList(
                new Practice(1, "John", "HR", 50000.0),
                new Practice(2, "Alice", "IT", 60000.0),
                new Practice(3, "Bob", "Finance", 55000.0)
        );

        //Get Max Salary of an Employee
       Optional<Practice> highestSalaryOfAnEmployee = ls.stream().max(Comparator.comparing(Practice::getSalary));

       if(highestSalaryOfAnEmployee.isPresent()){
           Practice p = highestSalaryOfAnEmployee.get();

           System.out.println("Employee with Highest Salary "+p.getEmpName());
           System.out.println("Max Salary " + p.getSalary());
       }

       // Max Salary in each Dept
        Map<String, Optional<Practice>>  mp = ls.stream().collect(Collectors.groupingBy(Practice::getDeptName,
               Collectors.maxBy(Comparator.comparing(Practice::getSalary))
       ));
       */
/*mp.forEach(deptName,practice)->{
            System.out.println("Department: " + dept);
            practice.ifPresent(practice -> {
                System.out.println("Employee with the highest salary: " + practice.getEmpName());
                System.out.println("Salary: " + practice.getSalary());
            });*//*

        }
    }
}
*/
