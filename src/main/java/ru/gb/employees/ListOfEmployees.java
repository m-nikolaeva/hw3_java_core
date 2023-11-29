package ru.gb.employees;

import ru.gb.comparator.EmployeeComparatorByName;
import ru.gb.comparator.EmployeeComparatorBySalary;
import ru.gb.comparator.EmployeeComparatorBySurname;

import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees {
    private List<Employee> employeeList;

    public ListOfEmployees(){
        this.employeeList = new ArrayList<>();
    }

    public void addEmployees(Employee employee){
        employeeList.add(employee);
    }

    public void printListOfEmployees(){
        System.out.println("Список сотрудников: ");
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    /**
     * Сортировка по имени
     */
    public void sortByName() {
        employeeList.sort(new EmployeeComparatorByName());
    }

    /**
     * Сортировка по фамилии
     */
    public void sortBySurname() {
        employeeList.sort(new EmployeeComparatorBySurname());
    }

    /**
     * Сортировка по размеру заработной платы
     */
    public void sortBySalary() {
        employeeList.sort(new EmployeeComparatorBySalary());
    }
}
