package ru.mirea.uibo1.spirin.pr2;

public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // или getLength(), так как они равны
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Переопределяем setWidth и setLength, чтобы сохранить "квадратность"
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
