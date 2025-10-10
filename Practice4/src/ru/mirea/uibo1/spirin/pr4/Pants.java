package ru.mirea.uibo1.spirin.pr4;

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел штаны: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела штаны: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }
}