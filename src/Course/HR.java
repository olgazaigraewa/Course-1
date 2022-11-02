package Course;


public class HR {


    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Антонов", "Игорь", "Николаевич", 1, 65000f);
        employee[1] = new Employee("Васильев", "Дмитрий", "Олегович", 2, 70000f);
        employee[2] = new Employee("Григорьев", "Сергей", "Геннадьевич", 1, 68000f);
        employee[3] = new Employee("Денисова", "Лариса", "Львовна", 2, 70000f);
        employee[4] = new Employee("Ерёмина", "Ольга", "Сергеевна", 3, 80000f);
        employee[5] = new Employee("Иванов", "Максим", "Петрович", 3, 75000f);
        employee[6] = new Employee("Кузнецов", "Артём", "Дмитриевич", 1, 63000f);
        employee[7] = new Employee("Левина", "Татьяна", "Семеновна", 2, 74000f);
        employee[8] = new Employee("Максимов", "Илья", "Михайлович", 3, 72000f);
        employee[9] = new Employee("Петров", "Антон", "Ильич", 3, 69000f);
        for (Employee i : employee) {
            System.out.println(i);
        }
        calculateSum();


    }

    private static void calculateSum() {
    }


}







