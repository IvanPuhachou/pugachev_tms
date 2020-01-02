package homework.hw_03.task_09;
/*
Пользователь должен указать с клавиатуры положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [0;15] и вывести его на экран в строку. После этого программа должна определить
и сообщить пользователю о том, сумма какой половины массива больше: левой или правой, либо сообщить, что эти суммы
модулей равны. Если пользователь введёт неподходящее число, то выдать соответствующее сообщение
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_09 {
    public static void main(String[] args) {

        System.out.println("Введи число, какой длинны массив ты хочешь");
        int arrayLength = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                arrayLength = input.nextInt();
            } else {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
                continue;
            }

            if (arrayLength <= 0) {
                System.out.println("Вы ввели значение меньшее либо равное нулю, а длинна массива должна быть положительной величиной. Попробуйте еще раз.");
                continue;
            }
            if (arrayLength % 2 != 0) {
                System.out.println("Вы должны ввести четное число, чтобы я мог разделить массив на две равные части. Попробуйте еще раз.");
                continue;
            }    //не совсем понял из условии задачи что такое "неподходящее число". Для себя определил только два ограничения
            input.close();
            break;

        }
        System.out.println("Ваше число - " + arrayLength);
        int[] array = new int[arrayLength];
        for (int a = 0; a < array.length; a++) {
            array[a] = (int) (Math.random() * 16);
        }

        System.out.println(Arrays.toString(array));

        int halfNumber = array.length / 2;

        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < halfNumber) {
                firstHalfSum += array[i];
            }
            if (i >= halfNumber) {
                secondHalfSum += array[i];
            }
        }
        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма чисел первой половины массива (" + firstHalfSum + ") больше суммы чисел второй половины массива (" + secondHalfSum + ")");
        }
        if (firstHalfSum < secondHalfSum) {
            System.out.println("Сумма чисел первой половины массива (" + firstHalfSum + ") меньше суммы чисел второй половины массива (" + secondHalfSum + ")");
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Сумма чисел обоих половин массива равны между собой (" + firstHalfSum + ")");
        }
    }
}
