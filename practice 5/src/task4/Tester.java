package task4;

public class Tester {
    public static void main(String[] args) {
        Priceable macbook = new Laptop(2500.99);
        Priceable toyota = new Car(35000.00);

        System.out.println("Laptop price: " + macbook.getPrice());
        System.out.println("Car price: " + toyota.getPrice());
    }
}
