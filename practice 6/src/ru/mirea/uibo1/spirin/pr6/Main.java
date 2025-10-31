package ru.mirea.uibo1.spirin.pr6;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Тестирование MathFunc
        MathCalculable mc1 = new MathFunc();
        System.out.println("2^10 = " + mc1.power(2, 10));
        System.out.println("Модуль числа 3+4i = " + mc1.complexModulus(3, 4));

        MathFunc math = new MathFunc();
        System.out.println("Длина окружности с радиусом 5 = " + math.circleLength(5));

        // Замечание из методички: следующая строка вызовет ошибку компиляции
        // MathCalculable mc2 = new MathCalculable(); // Ошибка: нельзя создать экземпляр интерфейса
    }
}
