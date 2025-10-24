package task4;

class Car implements Priceable { // Это уже другой Car, в другом пакете!
    private double price;
    public Car(double price) { this.price = price; }
    @Override public double getPrice() { return price; }
}
