package ru.mirea.uibo1.spirin.pr8;

import java.awt.*;

abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // Абстрактный метод, который должны будут реализовать все наследники
    abstract void draw(Graphics g);
}
