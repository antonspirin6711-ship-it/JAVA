package ru.mirea.uibo1.spirin.pr4;

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина надела юбку: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }
}
