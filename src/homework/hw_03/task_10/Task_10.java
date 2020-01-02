package homework.hw_03.task_10;
/*
Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только
из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Введи размер массива");
        int number = 0;

        while (true) { // проверка числа на пригодность
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                number = input.nextInt();
            } else {
                System.out.println("Вы ввели некорректное значение. Попробуйте еще раз.");
                continue;
            }
            if (number <= 3) {
                System.out.println("Ваше число должно быть больше 3. Попробуйте еще раз.");
                continue;
            }
            System.out.println("Ваше число - " + number);
            input.close();
            break;
        }

        int[] array = new int[number];  // создание первого массива согласно введенному числу
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (number + 1));
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println(Arrays.toString(array));

        int[] secondArray = new int[counter];  // создание второго массива
        int secondCounter = 0;  // счетчик индекса четного числа во втором массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                secondArray[secondCounter] = array[i];
                secondCounter++;
            }
        }
        System.out.println(Arrays.toString(secondArray));
    }
}