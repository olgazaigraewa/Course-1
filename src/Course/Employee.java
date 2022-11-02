package Course;

public class Employee {
    private String surName;
    private String name;
    private String patronymic;
    private int dept;
    private float salary;
    private static int id;


    public Employee(String surName, String name, String patronymic, int dept, float salary) {
        this.surName = surName;
        this.name = name;
        this.patronymic = patronymic;
        this.dept = dept;
        this.salary = salary;
        id++;

    }

    public Employee() {

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

    public void setDept(int dept) {
        this.dept = dept;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return " Фамилия  " + surName + ",  имя " + name + ",  отчество " + patronymic + ",  отдел " + dept + ", зарплата " + salary + " рублей. ";
    }
    private static void calculateSum() {

    }


    }









