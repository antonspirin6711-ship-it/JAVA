package task6_9;

public class Tester {
    public static void main(String[] args) {
        // Задание 9: Создаем массив Printable
        Printable[] items = {
                new Book("The Lord of the Rings"),
                new Journal("National Geographic"),
                new Shop("Read-City")
        };

        for (Printable item : items) {
            item.print(); // Вызываем метод print() для каждого объекта
        }
    }
}
