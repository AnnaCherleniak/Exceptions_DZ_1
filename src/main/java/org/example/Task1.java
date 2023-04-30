package org.example;

import java.util.ArrayList;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {
    public static void main(String[] args) {
//        1
        System.out.printf("%d/%d = %d%n", 10, 2, divideNumbers(10, 2));

//        2
        int [] numbers = {1, 2, 3, 4, 5};
        int index = 1;
        if (index < numbers.length) {
            System.out.println("Position element " + index + " = " + numbers[index]);
        } else throw new IndexOutOfBoundsException ("Index " + index + " out of bounds for length 10");
//        3
        ArrayList<Integer> numbers2 = new ArrayList<>();
        addedElement(numbers2, 2);
        System.out.println(numbers2);
        addedElement(numbers2, "j");
        System.out.println(numbers2);
    }

    private static int divideNumbers(int i, int i1) {
        int result = 0;
        if (i1 != 0) {
            result = i/i1;
        } else {
            throw new ArithmeticException("делить на 0 нельзя!");
        }
        return result;
    }

    private static void addedElement(ArrayList<Integer> numbers2, Object i) {
        if(i instanceof Integer) {
            numbers2.add((Integer) i);
        } else {
            throw new NumberFormatException ("Добавляете неверный формат данных");
        }
    }


}