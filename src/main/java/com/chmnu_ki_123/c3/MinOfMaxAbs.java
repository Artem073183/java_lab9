package com.chmnu_ki_123.c3;

import java.util.Scanner;

public class MinOfMaxAbs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриці N: ");
        int N = scanner.nextInt();
        double[][] matrix = new double[N][N];

        // Введення елементів матриці
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double[] maxAbsValues = new double[N];

        // Знаходимо максимальні за модулем значення стовпчиків
        for (int j = 0; j < N; j++) {
            maxAbsValues[j] = Math.abs(matrix[0][j]); // ініціалізація з першим елементом стовпчика
            for (int i = 1; i < N; i++) {
                double absValue = Math.abs(matrix[i][j]);
                if (absValue > maxAbsValues[j]) {
                    maxAbsValues[j] = absValue;
                }
            }
        }

        // Знаходимо мінімальний елемент серед максимальних за модулем
        double minOfMax = maxAbsValues[0];
        for (int j = 1; j < N; j++) {
            if (maxAbsValues[j] < minOfMax) {
                minOfMax = maxAbsValues[j];
            }
        }

        System.out.println("Мінімальний елемент серед максимальних за модулем елементів стовпчиків: " + minOfMax);
    }
}
