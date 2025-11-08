package ru.mirea.uibo1.spirin.pr8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {

    // Объявляем переменные для хранения счета
    private int milanScore = 0;
    private int madridScore = 0;

    // Объявляем компоненты GUI как поля класса, чтобы иметь к ним доступ из методов
    private JButton milanButton = new JButton("AC Milan");
    private JButton madridButton = new JButton("Real Madrid");
    private JLabel resultLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    public FootballMatch() {
        // Настройка основного окна
        super("Football Match Scoreboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Устанавливаем менеджер компоновки
        setLayout(new GridLayout(5, 1)); // 5 строк, 1 столбец

        // Добавляем компоненты в окно
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        // Добавляем обработчик событий для кнопки "AC Milan"
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        // Добавляем обработчик событий для кнопки "Real Madrid"
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });
    }

    // Метод для обновления всех надписей
    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        // Создаем и делаем окно видимым
        // SwingUtilities.invokeLater гарантирует, что GUI создается в правильном потоке
        SwingUtilities.invokeLater(() -> {
            new FootballMatch().setVisible(true);
        });
    }
}
