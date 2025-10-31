package ru.mirea.uibo1.spirin.pr6;

// Файл: src/Magazine.java
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.printf("Журнал '%s'\n", name);
    }

    // Задание 7: Статический метод для печати только журналов
    public static void printMagazines(Printable[] printable) {
        System.out.println("--- Список журналов ---");
        for (Printable p : printable) {
            // Используем оператор instanceof для проверки типа
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).getName());
            }
        }
    }
}
