package ru.mirea.uibo1.spirin.pr8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class RandomShapes extends JPanel {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public RandomShapes() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(450);
            int y = random.nextInt(450);
            int width = random.nextInt(100) + 20; // от 20 до 120
            int height = random.nextInt(100) + 20;
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            // С вероятностью 50% создаем либо прямоугольник, либо овал
            if (random.nextBoolean()) {
                shapes.add(new MyRectangle(color, x, y, width, height));
            } else {
                shapes.add(new MyOval(color, x, y, width, height));
            }
        }
    }

    // Этот метод вызывается автоматически для отрисовки компонента
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("20 Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new RandomShapes()); // Добавляем нашу панель в окно
        frame.setVisible(true);
    }
}
