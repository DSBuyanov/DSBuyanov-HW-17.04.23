package ru.geekbrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        // task3();
        task4();
    }

// Task №3: Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

    
static void task3() {
    // Генерируем случайные массивы с длиной равной 5 в 60% случаев
    int[] arr1 = generateArray();
    int[] arr2 = generateArray();

    try {
        // Вычисляем разности элементов двух массивов
        int[] res = getDiffArray(arr1, arr2);

        // Выводим полученный массив в консоль
        for (int e : res) {
            System.out.printf("%d\t", e);
        }
        System.out.println();
    } catch (CustomArraySizeException e) {
        // В случае, если длины массивов не равны, выводим сообщение об ошибке
        System.out.println(e.getMessage());
        System.out.printf("Длина первого массива: %d\nДлина второго массива: %d\n", e.getLength1(), e.getLength2());
    }
}

// Метод для генерации случайного массива с длиной равной 5 в 60% случаев
private static int[] generateArray() {
    int length = random.nextInt(10) < 6 ? 5 : 10;
    int[] arr = new int[length];
    for (int i = 0; i < arr.length; i++) {
        // Генерируем случайное число и записываем его в массив
        arr[i] = random.nextInt(21) - 10;
        System.out.printf("%d ", arr[i]);
    }
    System.out.println();
    return arr;
}

// Метод для вычисления разности элементов двух массивов
private static int[] getDiffArray(int[] arr1, int[] arr2) {
    // Проверяем, что оба массива не null
    if (arr1 == null || arr2 == null)
        throw new NullPointerException("Оба массива должны существовать.");

    // Проверяем, что длины массивов равны
    if (arr1.length != arr2.length)
        throw new CustomArraySizeException("Кол-во элементов массива должно быть одинаково.", arr1.length, arr2.length);

    // Вычисляем разности элементов двух массивов и записываем их в новый массив
    int[] res = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        res[i] = arr1[i] - arr2[i];
    }
    return res;
}



// *Task №4: Реализуйте метод, принимающий в качестве аргументов два целочисленных
// массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той
// же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь
// может увидеть-RuntimeException,т.е.ваше.

static void task4() {
    int[] arr1 = generateArray();
    int[] arr2 = generateArray();

    System.out.println("Первый массив: " + Arrays.toString(arr1));
    System.out.println("Второй массив: " + Arrays.toString(arr2));

    try {
        int[] result = divideArrays(arr1, arr2);
        System.out.println("Результат: " + Arrays.toString(result));
    } catch (RuntimeException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }
}


//Метод для деления элементов двух массивов.

public static int[] divideArrays(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) {
        throw new RuntimeException("Длины массивов не равны");
    }
    int[] result = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        if (arr2[i] == 0) {
            throw new RuntimeException("Деление на ноль невозможно");
        }
        result[i] = arr1[i] / arr2[i];
    }
    return result;
}

}

// Класс исключения для обработки ошибки, когда длины массивов не равны
class CustomArraySizeException extends RuntimeException {

int length1;
int length2;

public int getLength1() {
    return length1;
}

public int getLength2() {
        return length2;
    }

public CustomArraySizeException(String message, int length1, int length2) {
        super(message);
        this.length1 = length1;
        this.length2 = length2;
    }
}
