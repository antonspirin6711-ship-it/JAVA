package ru.mirea.uibo1.spirin.pr4;

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надел галстук: размер " + getSize() + ", цвет " + getColor() + ", цена " + getCost());
    }
}
