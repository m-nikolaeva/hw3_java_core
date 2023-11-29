package ru.gb.employees;

public abstract class Employee {
    private String name;
    private String surname;
    private double salary;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public abstract double calcSalary();
}
