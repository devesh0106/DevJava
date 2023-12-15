package Interview;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int empId;
    private String empName;
    private String deptName;
    private double salary;

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

    // Example constructor:
    public Employee(int empId, String empName, String deptName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
        this.salary = salary;
    }
 }

class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", "HR", 50000.0),
                new Employee(2, "Alice", "IT", 60000.0),
                new Employee(3, "Bob", "Finance", 55000.0)
        );
        //Q1. To get maximum Salary of each Employee
        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));

        if (highestPaidEmployee.isPresent()) {
            Employee employee = highestPaidEmployee.get();
            System.out.println("Employee with the highest salary: " + employee.getEmpName());
            System.out.println("Salary: " + employee.getSalary());
        } else {
            System.out.println("No employees found.");
        }
        System.out.println();
        //Q2. highest salary from each department
        Map<String, Optional<Employee>> highestSalariesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));

        highestSalariesByDepartment.forEach((dept, employee) -> {
            System.out.println("Department: " + dept);
            employee.ifPresent(emp -> {
                System.out.println("Employee with the highest salary: " + emp.getEmpName());
                System.out.println("Salary: " + emp.getSalary());
            });
            System.out.println();
        });
    }
}

