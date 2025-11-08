package ru.mirea.uibo1.spirin.pr8;

import java.awt.*;

class MyOval extends Shape {
    private int width, height;

    public MyOval(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
    }
}
