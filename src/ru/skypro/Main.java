package ru.skypro;

import java.util.Arrays;

public class Main {

        static Employee[] employee = new Employee[10];


     public static void main(String[] args) {

         employee[0] = new Employee("������ ���� ��������", 4, 60000);
         employee[1] = new Employee("������ ���� ��������", 1, 70000);
         employee[2] = new Employee("������� ������ ���������", 5, 50000);
         employee[3] = new Employee("������ ������� ����������", 3, 40000);
         employee[4] = new Employee("����� ������ ����������", 2, 80000);
         employee[5] = new Employee("������� ��������� �������������", 4, 35000);
         employee[6] = new Employee("����� ���� ����������", 4, 45000);
         employee[7] = new Employee("������ ������ ����������", 2, 47000);
         employee[8] = new Employee("������ �������� ��������", 1, 38000);
         employee[9] = new Employee("������ ���� �������", 5, 200000);



        System.out.println(Arrays.toString(employee));
        System.out.println("\n����� ������ �� �������� � ����� = " + sumSalaryMonth(employee) + "���.");
        minSalary(employee);
        maxSalary(employee);
        System.out.println("\n������� �������� ����������� = " + averageSalary(employee) + "���.");
        print(employee);



    }

    static int sumSalaryMonth (Employee[] employee) {

        int sum = 0;
         for (Employee value : employee) {
             sum = sum + value.getSalary();
         }
         return sum;
     }

      static void minSalary (Employee[] employees) {
         int min = employees[0].getSalary();
         String pureNew = null;
         for (Employee employee : employees) {
             if (employee.getSalary() < min) {
                 min = employee.getSalary();
                 pureNew = employee.getName();
             }
         }
         System.out.println("\n��������� � ����������� ��������� - " + pureNew +
                 ". �������� - "+ min + " ���.");
     }

     static void maxSalary (Employee[] employees) {
        int max = employees[0].getSalary();
        String richNew = null;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                richNew = employee.getName();
            }
        }
        System.out.println("\n��������� � ������������ ��������� - " + richNew +
                ". �������� - "+ max + " ���.");
    }

    static int averageSalary (Employee[] employees) {
         int aver = sumSalaryMonth(employees)/employees.length;
         return aver;

    }


     static void print (Employee[] employees)  {
        System.out.println("\n������ ������ ��� �����������:");
        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }
    }
}
