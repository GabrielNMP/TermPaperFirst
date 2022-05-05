package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Петров Петр Петрович", 4, 60000);
        employee[1] = new Employee("Иванов Иван Иванович", 1, 70000);
        employee[2] = new Employee("Сидоров Сергей Сергеевич", 5, 50000);
        employee[3] = new Employee("Ветров Алексей Алексеевич", 3, 40000);
        employee[4] = new Employee("Умнов Виктор Викторович", 2, 80000);
        employee[5] = new Employee("Комаров Александр Александрович", 4, 35000);
        employee[6] = new Employee("Косов Иван Алексеевич", 4, 45000);
        employee[7] = new Employee("Трудов Михаил Михайлович", 2, 47000);
        employee[8] = new Employee("Копнов Спиридон Олегович", 1, 38000);
        employee[9] = new Employee("Кнопов Олег Юрьевич", 5, 200000);

        System.out.println(Arrays.toString(employee));
        sumSalaryMonth(employee);
        minSalary(employee);
        maxSalary(employee);
        print(employee);




    }

    public static void sumSalaryMonth (Employee[] employee) {
        int sum = 0;
         for (Employee value : employee) {
             sum = sum + value.getSalary();
         }
        System.out.println("\nСумма затрат на зарплаты в месяц = " + sum + "руб."+
                "\n\nСредняя зарплата сотрудника в месяц = " + sum / employee.length + "руб.");
     }

     public static void minSalary (Employee[] employees) {
         int min = employees[0].getSalary();
         String pureNew = null;
         for (Employee employee : employees) {
             if (employee.getSalary() < min) {
                 min = employee.getSalary();
                 pureNew = employee.getName();
             }
         }
         System.out.println("\nСотрудник с минимальной зарплатой - " + pureNew +
                 ". Получает - "+ min + " руб.");
     }

    public static void maxSalary (Employee[] employees) {
        int max = employees[0].getSalary();
        String richNew = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                richNew = employee.getName();
            }
        }
        System.out.println("\nСотрудник с максимальной зарплатой - " + richNew +
                ". Получает - "+ max + " руб.");
    }


    public static void print (Employee[] employees)  {
        System.out.println("\nПолный список ФИО Сотрудников:");
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }
    }
}
