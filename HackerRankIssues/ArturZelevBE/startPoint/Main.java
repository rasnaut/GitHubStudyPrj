package org.example.practice2905.startPoint;

import org.example.practice2905.classes.Developer;
import org.example.practice2905.classes.Employee;
import org.example.practice2905.classes.Manager;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = {
                new Manager("Joe", "HR", 5000.00, 2),
                new Developer("Jim", "Dev", 7000.00, "Java")
        };

        for (Employee employee : employeesArray) {
            System.out.println("Employee: " + employee + " " + "Has bonus: " + employee.calculateBonus());
        }
    }
}
