package ru.geekbrains;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Вычисляем n-ое треугольное число
            System.out.print("Введите число n для вычисления n-го треугольного числа: ");
            int n = scanner.nextInt();
            int triangleNumber = 0;
            for (int i = 1; i <= n; i++) {
                triangleNumber += i;
            }
            System.out.println("n-ое треугольное число: " + triangleNumber);

            // Вычисляем факториал числа n
            System.out.print("Введите число n для вычисления факториала: ");
            n = scanner.nextInt();
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Факториал числа " + n + ": " + factorial);
        }
    }
    
}
