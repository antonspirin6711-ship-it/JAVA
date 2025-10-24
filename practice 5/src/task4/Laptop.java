package task4;

class Laptop implements Priceable {
    private double price;
    public Laptop(double price) { this.price = price; }
    @Override public double getPrice() { return price; }
}
