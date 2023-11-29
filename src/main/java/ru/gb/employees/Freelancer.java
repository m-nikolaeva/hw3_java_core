package ru.gb.employees;

public class Freelancer extends Employee{

    public Freelancer(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calcSalary() {
        return 20.8 * 8 * super.getSalary();
    }

    @Override
    public String toString(){
        return String.format("Freelancer: %s %s, salary = %.1f rub",
                super.getSurname(), super.getName(), calcSalary());
    }
}
