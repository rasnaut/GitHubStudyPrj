package org.example.practice2905.classes;

import org.example.practice2905.interfaces.IEmployee;

public class Manager extends Employee {
    int subordinatesCount;

    public Manager(String name, String position, double salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "subordinatesCount=" + subordinatesCount +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.03 * subordinatesCount;
    }
}
