package ru.mirea.uibo1.spirin.pr7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        int numberOfElements = 100000;

        // --- ArrayList ---
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("--- Тестирование ArrayList ---");

        // 1. Вставка в конец
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("Вставка в конец: " + (endTime - startTime) + " нс");

        // 2. Вставка в начало
        startTime = System.nanoTime();
        arrayList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Вставка в начало: " + (endTime - startTime) + " нс");

        // 3. Удаление из начала
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Удаление из начала: " + (endTime - startTime) + " нс");

        // 4. Поиск элемента
        startTime = System.nanoTime();
        arrayList.contains(numberOfElements / 2);
        endTime = System.nanoTime();
        System.out.println("Поиск элемента: " + (endTime - startTime) + " нс");

        System.out.println();

        // --- LinkedList ---
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("--- Тестирование LinkedList ---");

        // 1. Вставка в конец
        startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Вставка в конец: " + (endTime - startTime) + " нс");

        // 2. Вставка в начало
        startTime = System.nanoTime();
        linkedList.add(0, -1);
        endTime = System.nanoTime();
        System.out.println("Вставка в начало: " + (endTime - startTime) + " нс");

        // 3. Удаление из начала
        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        System.out.println("Удаление из начала: " + (endTime - startTime) + " нс");

        // 4. Поиск элемента
        startTime = System.nanoTime();
        linkedList.contains(numberOfElements / 2);
        endTime = System.nanoTime();
        System.out.println("Поиск элемента: " + (endTime - startTime) + " нс");
    }
}
