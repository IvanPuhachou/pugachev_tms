package homework.hw_03.task_06;
/*
Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */

import java.util.Arrays;

public class Task_06 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(array));

        int firstNumber = array[0];
        int nextNumber;
        int coincidence = 0;

        for (int i = 1; i < array.length; i++) {
            nextNumber = array[i];
            if (nextNumber > firstNumber) {
                coincidence++;
            }
            firstNumber = array[i];
        }

        if (coincidence == array.length - 1) {
            System.out.println("Массив является строго возврастающей последовательностью");
        } else System.out.println("Массив не является строго возврастающей последовательностью");
    }
}
