package ru.mirea.uibo1.spirin.pr6;

// Файл: src/Test4.java
public class Test4 {
    public static void main(String[] args) {
        System.out.println("--- Тестирование статических методов printBooks и printMagazines ---");

        Printable[] items = {
                new Book("Война и мир", "Лев Толстой"),
                new Magazine("Vogue"),
                new Book("Преступление и наказание", "Федор Достоевский"),
                new Magazine("National Geographic"),
                new Book("Мастер и Маргарита", "Михаил Булгаков")
        };

        // Вызываем статические методы напрямую из классов
        Magazine.printMagazines(items);
        System.out.println(); // Пустая строка для разделения
        Book.printBooks(items);
    }
}
