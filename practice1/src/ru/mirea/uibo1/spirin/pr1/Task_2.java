package ru.mirea.uibo1.spirin.pr1;

import java.util.Scanner;

public class Task_2 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Введите размер массива: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
        System.out.print("Введите массив: 5arr[" + i + "] = ");
        arr[i] = sc.nextInt();
    }

    int sum1 = 0, i = 0;
    while (i < n) {
        sum1 += arr[i];
        i++;
    }

    int sum2 = 0, j = 0;
    do {
        sum2 += arr[j];
        j++;
    } while (j < n);

    int max = arr[0], min = arr[0];
    for (int k = 1; k < n; k++) {
        if (arr[k] > max) max = arr[k];
        if (arr[k] < min) min = arr[k];
    }

    System.out.println("Сумма (while) = " + sum1);
    System.out.println("Сумма (do-while) = " + sum2);
    System.out.println("Максимум = " + max);
    System.out.println("Минимум = " + min);
}
}
