package homework.hw_03.task_03;
/*
Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран. Подсчитайте сколько
в массиве чётных элементов и выведете это количество на экран на отдельной строке.
 */

import java.util.Arrays;

public class Task_03 {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99);
        }

        System.out.println(Arrays.toString(array));

        int calculatorEven = 0;

        for (int d = 0; d < array.length; d++) {
            if (array[d] % 2 == 0) {
                calculatorEven++;
            }
        }
        System.out.println("В массиве случайных чисел количество четных равно " + calculatorEven);
    }
}
