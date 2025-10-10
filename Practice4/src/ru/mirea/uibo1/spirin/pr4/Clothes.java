package ru.mirea.uibo1.spirin.pr4;

// Абстрактный класс Clothes
abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}