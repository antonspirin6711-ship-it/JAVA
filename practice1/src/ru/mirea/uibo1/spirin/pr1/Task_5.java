package ru.mirea.uibo1.spirin.pr1;

import java.util.Scanner;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(n + "! = " + fact);
    }
}

