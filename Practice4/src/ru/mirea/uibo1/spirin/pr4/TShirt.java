package ru.mirea.uibo1.spirin.pr4;

// Классы-наследники
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела футболку: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }
}
