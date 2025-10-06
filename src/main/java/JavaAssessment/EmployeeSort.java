package JavaAssessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
    private int id;
    private String name;
    private double salary;

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();

        employees.add(new Employee1(101, "John", 50000));
        employees.add(new Employee1(102, "Alice", 75000));
        employees.add(new Employee1(103, "Bob", 60000));
        employees.add(new Employee1(104, "Daisy", 45000));

        System.out.println("Before Sorting:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }

        // Sort by salary using Comparator class
        Collections.sort(employees, new Comparator<Employee1>() {
            @Override
            public int compare(Employee1 e1, Employee1 e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        System.out.println("\nAfter Sorting by Salary:");
        for (Employee1 e : employees) {
            System.out.println(e);
        }
    }
}
