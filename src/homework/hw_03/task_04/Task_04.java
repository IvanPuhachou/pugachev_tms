package homework.hw_03.task_04;
/*
Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */

import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 21);
        }

        System.out.println(Arrays.toString(array));

        for (int b = 1; b < array.length; b += 2) {
            array[b] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
