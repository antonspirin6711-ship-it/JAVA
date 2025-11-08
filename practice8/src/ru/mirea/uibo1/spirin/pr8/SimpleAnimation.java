package ru.mirea.uibo1.spirin.pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleAnimation extends JPanel {

    // Массив с иконками-кадрами
    private ImageIcon[] frames;
    // Индекс текущего кадра
    private int currentFrame = 0;
    // Таймер для переключения кадров
    private Timer animationTimer;

    public SimpleAnimation() {
        // Укажите здесь имена ваших файлов-кадров
        String[] frameNames = {"frame1.png", "frame2.png", "frame3.png", "frame4.png"};
        frames = new ImageIcon[frameNames.length];

        for (int i = 0; i < frameNames.length; i++) {
            frames[i] = new ImageIcon(frameNames[i]);
        }

        // Устанавливаем предпочтительный размер панели по размеру первого кадра
        setPreferredSize(new Dimension(frames[0].getIconWidth(), frames[0].getIconHeight()));

        // Создаем таймер. 150 - задержка в миллисекундах (чем меньше, тем быстрее анимация)
        animationTimer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Переключаем на следующий кадр
                currentFrame = (currentFrame + 1) % frames.length;
                repaint(); // Перерисовываем панель, чтобы отобразить новый кадр
            }
        });
        animationTimer.start(); // Запускаем анимацию
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Рисуем текущий кадр
        if (frames[currentFrame] != null) {
            frames[currentFrame].paintIcon(this, g, 0, 0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Animation");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SimpleAnimation());
            frame.pack(); // Устанавливаем размер окна по размеру панели
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}