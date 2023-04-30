package org.example;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
// элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

public class Task3 {
    public static void main(String[] args) {
        int[] numbers1 = {4, 5, 6, 7, 8, 9};
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7};
        int[] numbers = sumArrays(numbers1, numbers2);
        printArray(numbers);
        numbers = sumArrays(numbers2, numbers3);
        printArray(numbers);
    }

    private static int[] sumArrays(int[] numbers1, int[] numbers2) {
        int[] result = new int[numbers1.length];
        if (numbers1.length == numbers2.length) {
            for (int i = 0; i < numbers1.length; i++) {
                result[i] = numbers1[i] - numbers2[i];
            }
        } else throw new RuntimeException("Матрицы разной длины!");

        return result;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
}
