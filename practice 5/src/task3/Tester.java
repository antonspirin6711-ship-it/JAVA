package task3;

public class Tester {
    public static void main(String[] args) {
        Nameable mars = new Planet("Mars");
        Nameable tesla = new Car("Tesla Model S");

        System.out.println(mars.getName());
        System.out.println(tesla.getName());
    }
}
