package Course;

import java.util.Objects;

public class Employee {

    private final int id;
    private static int count = 1;
    private final String surName;
    private final String name;
    private final String patronymic;
    private int dept;
    private double salary;

    public Employee(int id, String surName, String name, String patronymic, int dept, double salary) {
        this.id = count++;
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.dept = dept;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }


    @Override                                                // equals()
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && dept == employee.dept && Double.compare(employee.salary, salary) == 0 && Objects.equals(surName, employee.surName) && Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic);
    }

    @Override                                                 // hashCode()
    public int hashCode() {
        return Objects.hash(id, surName, name, patronymic, dept, salary);
    }

    @Override
    public String toString() {
        return "Сотрудник № " + "id " + id + ", Фамилия " + surName + ", Имя " + name + ", Отчество " + patronymic + ", Отдел " + dept + ", Зарплата " + salary;

    }

}










