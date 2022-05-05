package ru.skypro;

public class Employee {
    //�������������
    private String name;
    private int dept;
    private int salary;
    static int counter = 1;
    private int id;



    //�����������
    public Employee (String name, int dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        id = counter++;
    }
//�������

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


    //�������
    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n ���������: " +
                " " + name +
                ". ����� - " + dept +
                ". �������� ���������� - " + salary +
                ". ����������������� ����� - " + id
                ;
    }


}
