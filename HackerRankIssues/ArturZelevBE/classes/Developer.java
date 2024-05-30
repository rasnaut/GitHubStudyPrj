package org.example.practice2905.classes;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String position, double salary, String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double calculateBonus() {
        return getSalary() + 500;
    }
}
