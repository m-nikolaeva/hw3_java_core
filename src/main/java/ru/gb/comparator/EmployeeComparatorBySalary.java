package ru.gb.comparator;

import ru.gb.employees.Employee;

import java.util.Comparator;

public class EmployeeComparatorBySalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calcSalary(), o2.calcSalary());
    }
}
