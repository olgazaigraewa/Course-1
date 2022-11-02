import Course.Employee;

public class Counted {
    private static final Employee COUNTER = new Employee ();

    private final   int id;

    public Counted() {
        id = COUNTER.getId();
    }

    public int getId() {
        return id;
    }


    public static void main(String... args) {
        System.out.println(new Counted().getId());
        System.out.println(new Counted().getId());
        System.out.println(new Counted().getId());
    }
}
