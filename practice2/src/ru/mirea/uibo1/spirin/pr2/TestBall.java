package ru.mirea.uibo1.spirin.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(45, 25);
        System.out.println(b1);
    }
}