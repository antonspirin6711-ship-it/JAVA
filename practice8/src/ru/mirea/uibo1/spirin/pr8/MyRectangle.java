package ru.mirea.uibo1.spirin.pr8;

import java.awt.*;

class MyRectangle extends Shape {
    private int width, height;

    public MyRectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
