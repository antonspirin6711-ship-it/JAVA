package ru.mirea.uibo1.spirin.pr8;

import javax.swing.*;
import java.awt.*;

public class ImageViewer {
    public static void main(String[] args) {
        // Проверяем, был ли передан аргумент
        if (args.length == 0) {
            System.out.println("Пожалуйста, укажите путь к файлу картинки в аргументах командной строки.");
            return;
        }

        String imagePath = args[0];

        // Используем SwingUtilities для безопасности потоков GUI
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // ImageIcon автоматически загрузит изображение
            ImageIcon icon = new ImageIcon(imagePath);

            // Проверяем, удалось ли загрузить изображение
            if (icon.getImageLoadStatus() == MediaTracker.ERRORED) {
                JOptionPane.showMessageDialog(null, "Не удалось загрузить изображение: " + imagePath,
                        "Ошибка", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }

            JLabel imageLabel = new JLabel(icon);

            frame.add(new JScrollPane(imageLabel)); // Добавляем скролл, если картинка большая
            frame.pack(); // Устанавливаем размер окна по размеру картинки
            frame.setLocationRelativeTo(null); // Окно по центру экрана
            frame.setVisible(true);
        });
    }
}
