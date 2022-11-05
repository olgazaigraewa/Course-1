package Course;

import java.util.Arrays;

public class HR {

    private final Employee[] employee;                                     //массив

    public HR(Employee[] employee) {                               //контструктор
        this.employee = employee;

    }


    public double sumSalaryAllEmployee() {      //сумма затрат на зарплату в месяц
        double sumSalary = 0;
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                sumSalary += employee1.getSalary();
            }
        }

        return sumSalary;

    }


    public double getMinSalary() {                                   //расчет минимальной зарплаты
        double minSalary = 0;
        for (int count = 0; count < employee.length; count++) {
            if (employee[count] != null) {
                minSalary = employee[count].getSalary();
                break;
            }
        }
        for (int count = 0; count < employee.length; count++) {
            if (employee[count] != null && employee[count].getSalary() < minSalary) {
                minSalary = employee[count].getSalary();
            }
        }

        return minSalary;
    }


    public double getMaxSalary() {                            //расчет максимальной зарплаты
        double maxSalary = 0;
        int count = 0;
        for (; count < employee.length; count++) {
            if (employee[count] != null && employee[count].getSalary() > maxSalary) {
                maxSalary = employee[count].getSalary();
            }
        }
        return maxSalary;
    }

    public double averageSalary() {                        //расчет Средней зарплаты
        double averageSalary = 0;
        double sumSalary = 0;
        double countId = 0;
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                sumSalary += employee1.getSalary();
                countId++;
            }
        }
        averageSalary = sumSalary / countId;


        return averageSalary;

    }


    @Override
    public String toString() {
        return "Отдел кадров :" +
                "сотрудник =" + Arrays.toString(employee);
    }
}

































































