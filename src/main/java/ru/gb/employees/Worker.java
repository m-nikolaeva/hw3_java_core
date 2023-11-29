package ru.gb.employees;

public class Worker extends Employee{

    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calcSalary() {
        return super.getSalary();
    }

    @Override
    public String toString(){
        return String.format("Woker: %s %s, salary = %.1f rub",
                super.getSurname(), super.getName(), calcSalary());
    }

}
