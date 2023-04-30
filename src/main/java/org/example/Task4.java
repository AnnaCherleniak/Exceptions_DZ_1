package org.example;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task4 {
    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = {1, 2, 3, 4, 5, 6};
        int[] numbers4 = {0, 2, 3, 4, 5};
        int[] numbers = divideNumberArrays(numbers1, numbers2);
        printArray(numbers);
        numbers = divideNumberArrays(numbers1, numbers3);
        printArray(numbers);
        numbers = divideNumberArrays(numbers1, numbers4);
        printArray(numbers);
    }

    private static int[] divideNumberArrays(int[] numbers1, int[] numbers2) {
        int[] result = new int[numbers1.length];
        if (numbers1.length == numbers2.length) {
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers2[i] != 0) {
                    result[i] = numbers1[i] / numbers2[i];
                } else throw new ArithmeticException("На 0 делить нельзя!");

            }
        } else throw new RuntimeException("Матрицы разной длины!");

        return result;
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
