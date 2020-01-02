package homework.hw_03.task_08;

/*
Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем
вывести количество целых элементов в третьем массиве.
 */

import java.util.Arrays;

public class Task_08 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            secondArray[i] = 1 + (int) (Math.random() * 10);
            thirdArray[i] = (double) firstArray[i] / secondArray[i];
        }
        //поскольку при определении отношения одного числа к другому второе из них не должно
        // равняться нулю я поменял диапозон случайных значений во втором массиве с [0,9] на [1,10]

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(thirdArray));

        int counter = 0;

        for (int i = 0; i < thirdArray.length; i++) {
            if (thirdArray[i] == (int) thirdArray[i]) {
                counter++;
            }
        }
        System.out.println("Число целочисленных отношений чисел первого массива ко второму равно " + counter);
    }
}
