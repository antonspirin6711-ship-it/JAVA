package ru.mirea.uibo1.spirin.pr6;

// Файл: src/Test3.java
public class Test3 {
    public static void main(String[] args) {
        System.out.println("--- Тестирование ProcessStrings ---");

        StringManipulator processor = new ProcessStrings();
        String myString = "Hello world, I love Java!";

        System.out.println("Исходная строка: \"" + myString + "\"");
        System.out.println("1. Количество символов: " + processor.countCharacters(myString));
        System.out.println("2. Символы на нечетных позициях: \"" + processor.oddPositionChars(myString) + "\"");
        System.out.println("3. Инвертированная строка: \"" + processor.reverseString(myString) + "\"");
    }
}
