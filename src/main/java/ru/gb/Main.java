package ru.gb;

import ru.gb.employees.Freelancer;
import ru.gb.employees.ListOfEmployees;
import ru.gb.employees.Worker;

public class Main {
    public static void main(String[] args) {
        Freelancer fr1 = new Freelancer("Anton", "Antonov", 1000);
        Freelancer fr2 = new Freelancer("Ivan", "Ivanov", 700);
        Worker w1 = new Worker("Alina", "Petrova", 145000);
        Worker w2 = new Worker("Nikita", "Timakov", 134000);
        Freelancer fr3 = new Freelancer("Anna", "Semenova", 900);
        Worker w3 = new Worker("Olga", "Maximova", 140000);

        ListOfEmployees listOfEmployees = new ListOfEmployees();
        listOfEmployees.addEmployees(w1);
        listOfEmployees.addEmployees(w2);
        listOfEmployees.addEmployees(w3);
        listOfEmployees.addEmployees(fr1);
        listOfEmployees.addEmployees(fr2);
        listOfEmployees.addEmployees(fr3);

        listOfEmployees.printListOfEmployees();

        System.out.println();

        /**
         * Список сотрудников, отсортированный по имени
         */
        listOfEmployees.sortByName();
        listOfEmployees.printListOfEmployees();

        System.out.println();

        /**
         * Список сотрудников, отсортированный по фамилии
         */
        listOfEmployees.sortBySurname();
        listOfEmployees.printListOfEmployees();

        System.out.println();

        /**
         * Список сотрудников, отсортированный по размеру заработной платы
         */
        listOfEmployees.sortBySalary();
        listOfEmployees.printListOfEmployees();
    }
}