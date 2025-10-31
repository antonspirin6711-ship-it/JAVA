package ru.mirea.uibo1.spirin.pr6;

// File: MathFunc.java
public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(power(real, 2) + power(imaginary, 2));
    }

    // Пример использования: вычисление длины окружности
    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}
