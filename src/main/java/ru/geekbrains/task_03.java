package ru.geekbrains;
// Реализовать простой калькулятор
// Минимум -- > Условия + Цикл
// Введите число
// Введите число
// Выберите операцию
// 1 - сложить
// 2 - умножить

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        int operation;

        System.out.print("Введите число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введите число: ");
        num2 = scanner.nextDouble();

        System.out.println("Выберите операцию:\n1 - сложить\n2 - умножить");
        operation = scanner.nextInt();

        if (operation == 1) {
            result = num1 + num2;
        } else if (operation == 2) {
            result = num1 * num2;
        } else {
            System.out.println("Операция не распознана!");
        }

        System.out.println("Результат: " + result);
    }
}
