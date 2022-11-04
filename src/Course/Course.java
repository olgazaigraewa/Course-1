package Course;


public class Course {

    private static long[] array;
    private static long[] myArray;

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        HR hr = new HR(employees);
        employees[0] = new Employee(1, "Антонов", "Игорь", "Николаевич", 1, 68000);
        employees[1] = new Employee(2, "Васильев", "Дмитрий", "Олегович", 2, 62000);
        employees[2] = new Employee(3, "Григорьев", "Сергей", "Геннадьевич", 2, 59000);
        employees[3] = new Employee(4, "Денисова", "Лариса", "Львовна", 3, 74000);
        employees[4] = new Employee(5, "Еремина", "Ольга", "Сергеевна", 2, 69000);
        employees[5] = new Employee(6, "Тимофеева", "Ольга", "Романовна", 3, 68000);
        employees[6] = new Employee(7, "Кузнецов", "Артем", "Дмитриевич", 1, 75000);
        employees[7] = new Employee(8, "Левина", "Татьяна", "Семеновна", 3, 79000);
        employees[8] = new Employee(9, "Максимов", "Илья", "Михайлович", 3, 65000);
        employees[9] = new Employee(10, "Юркина", "Елена", "Михайлова", 1, 69000);

        System.out.println("hr.sumSalaryAllEmployee() = " + hr.sumSalaryAllEmployee());
        System.out.println("hr.getMinSalary() = " + hr.getMinSalary());
        System.out.println("hr.getMaxSalary() = " + hr.getMaxSalary());
        System.out.println("hr.averageSalary() = " + hr.averageSalary());
        System.out.print("employee.toString() = " + hr.toString());


    }

}





