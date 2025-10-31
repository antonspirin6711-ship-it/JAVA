package ru.mirea.uibo1.spirin.pr6;

// File: ProcessStrings.java
public class ProcessStrings implements StringManipulator {
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String oddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((i + 1) % 2 != 0) { // Нечетные позиции: 1, 3, 5... (индексы 0, 2, 4...)
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}