package task3;

class Car implements Nameable {
    private String brand;
    public Car(String brand) { this.brand = brand; }
    @Override public String getName() { return "Car brand: " + brand; }
}