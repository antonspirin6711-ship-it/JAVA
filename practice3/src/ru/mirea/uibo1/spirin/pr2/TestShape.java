package ru.mirea.uibo1.spirin.pr2;

public class TestShape {
    public static void main(String[] args) {
        // --- Блок 1: Upcasting (Восходящее преобразование) ---
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1); // Вызывает toString() из Circle
        System.out.println(s1.getArea()); // Вызывает getArea() из Circle
        System.out.println(s1.getPerimeter()); // Вызывает getPerimeter() из Circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius()); // ОШИБКА КОМПИЛЯЦИИ

        // --- Блок 2: Downcasting (Нисходящее преобразование) ---
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // Теперь работает

        // --- Блок 3: Абстрактный класс ---
        // Shape s2 = new Shape(); // ОШИБКА КОМПИЛЯЦИИ

        // --- Блок 4: Полиморфизм с Rectangle ---
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength()); // ОШИБКА КОМПИЛЯЦИИ
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1.getLength()); // Работает после downcasting

        // --- Блок 5: Полиморфизм с Square и Rectangle ---
        Shape s4 = new Square(6.6); // Upcast Square to Shape
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide()); // ОШИБКА КОМПИЛЯЦИИ

        // Downcast Shape s4 to Rectangle
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide()); // ОШИБКА КОМПИЛЯЦИИ
        System.out.println(r2.getLength());

        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide()); // Теперь работает
        System.out.println(sq1.getLength());
    }
}
