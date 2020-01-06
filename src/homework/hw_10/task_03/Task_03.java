package homework.hw_10.task_03;

import java.util.Scanner;

/*
Попросите пользователя создать массив размером Х, но не больше размера Y. Если пользователь
ввел число больше Y или отрицательное, то выбросьте исключение и попросите исправить.
 */

public class Task_03 {
    private static Integer max = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array. Max size is " + max);

        int size = scanner.nextInt();   // Вариант ошибки с введением не числа как таковго не разбирал
        for (; ; ) {
            if (size < 0) {
                try {
                    throw new NegativeNumberException("Your number cannot be less then zero");
                } catch (NegativeNumberException e) {
                    System.out.println("Your number cannot be less then zero");
                    System.out.println("Please enter new size of the array");
                    size = scanner.nextInt();
                }
            } else  if (size > max) {
                try {
                    throw new MoreThenMaxException("Your number cannot be more then max");
                } catch (MoreThenMaxException e) {
                    System.out.println("Your number cannot be more then max");
                    System.out.println("Please enter new size of the array");
                    size = scanner.nextInt();
                }
            } else {
                scanner.close();
                break;
            }
        }

        int[] array = new int[size];
        System.out.println(array.length);
    }
}