package ru.mirea.uibo1.spirin.pr6;

// Файл: src/Book.java
public class Book implements Printable {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s)\n", name, author);
    }

    // Задание 8: Статический метод для печати только книг
    public static void printBooks(Printable[] printable) {
        System.out.println("--- Список книг ---");
        for (Printable p : printable) {
            // Используем оператор instanceof для проверки типа
            if (p instanceof Book) {
                System.out.println(((Book) p).getName());
            }
        }
    }
}
