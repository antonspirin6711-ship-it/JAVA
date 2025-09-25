package ru.mirea.uibo1.spirin.pr1;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + avg);
    }
}
