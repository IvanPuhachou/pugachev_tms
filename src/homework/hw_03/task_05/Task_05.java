package homework.hw_03.task_05;
/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый, выведите массивы на экран в двух
отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */

import java.util.Arrays;

public class Task_05 {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] firstArray = new int[arrayLength];
        int[] secondArray = new int[arrayLength];
        double firstSum = 0;
        double firstMean;
        double secondSum = 0;
        double secondMean;

        for (int i = 0; i < arrayLength; i++) {
            firstArray[i] = (int) (Math.random() * 16);
            firstSum += firstArray[i];
        }

        firstMean = firstSum / firstArray.length;
        System.out.println(Arrays.toString(firstArray));

        for (int i = 0; i < arrayLength; i++) {
            secondArray[i] = (int) (Math.random() * 16);
            secondSum += secondArray[i];
        }

        secondMean = secondSum / secondArray.length;
        System.out.println(Arrays.toString(secondArray));


        if (firstMean < secondMean) {
            System.out.println("Среднее значения чисел первого массива (" + firstMean + ") меньше среднего значения чисел второго массива (" + secondMean + ")");
        }
        if (firstMean > secondMean) {
            System.out.println("Среднее значения чисел первого массива (" + firstMean + ") больше среднего значения чисел второго массива (" + secondMean + ")");
        }
        if (firstMean == secondMean) {
            System.out.println("Средние значения чисел обоих массивов равны между собой - " + firstMean);
        }
    }
}
