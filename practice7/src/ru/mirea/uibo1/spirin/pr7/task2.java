package ru.mirea.uibo1.spirin.pr7;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату для сравнения (в формате гггг-мм-дд): ");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date userDate = dateFormat.parse(userInput);
            Date currentDate = new Date();

            System.out.println("Введенная дата: " + dateFormat.format(userDate));
            System.out.println("Текущая дата:   " + dateFormat.format(currentDate));

            // Сравнение дат с использованием методов before(), after() и equals()
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата была раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата будет после текущей.");
            } else {
                // Для сравнения только по дню, без учета времени, лучше использовать Calendar
                System.out.println("Введенные даты совпадают (с точностью до дня).");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка! Неверный формат даты. Пожалуйста, используйте гггг-мм-дд.");
        }
        scanner.close();
    }
}
