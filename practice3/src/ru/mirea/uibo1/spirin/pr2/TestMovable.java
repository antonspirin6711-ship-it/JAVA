package ru.mirea.uibo1.spirin.pr2;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 1, 2);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(2, 1, 2, 3, 20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(0, 5, 5, 0, 1, 1);
        System.out.println(m3);
        m3.moveDown();
        System.out.println(m3);
    }
}