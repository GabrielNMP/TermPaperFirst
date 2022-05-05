package ru.skypro;

public class Employee {
    //инициализация
    private String name;
    private int dept;
    private int salary;
    static int counter = 1;
    private int id;



    //конструктор
    public Employee (String name, int dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        id = counter++;
    }
//геттеры

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDept() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }


    //сеттеры
    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n Сотрудник: " +
                " " + name +
                ". Отдел - " + dept +
                ". Зарплата сотрудника - " + salary +
                ". Идентификационный номер - " + id
                ;
    }


}
