package homework.hw_03.task_07;
/*
Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите какой элемент является в этом
 массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */

import java.util.Arrays;

public class Task_07 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 16);
        }

        System.out.println(Arrays.toString(array)); // для проверки получаемого результата

        int lastIndexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array [lastIndexMax]) {
                lastIndexMax = i; // логично, что индекс указан с учетом особенностей массивов в java - перовому элементу соответствует индекс 0
            }
        }
        System.out.println("Индекс последнего вхождения максимального значения в массиве равен " + lastIndexMax);
    }
}
