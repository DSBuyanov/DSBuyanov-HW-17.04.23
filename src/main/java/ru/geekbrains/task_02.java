package ru.geekbrains;
// Вывести все простые числа от 1 до 1000

public class task_02 {
    public static void main(String[] args) {
        boolean[] isComposite = new boolean[1001]; // массив для отсеивания составных чисел

        for (int i = 2; i <= 1000; i++) {
            if (!isComposite[i]) { // если i - простое число
                System.out.print(i + " "); // выводим его на экран

                // отсеиваем все кратные i
                for (int j = i * i; j <= 1000; j += i) {
                    isComposite[j] = true;
                }
            }
        }
    }
}
