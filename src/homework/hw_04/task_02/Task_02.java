package homework.hw_04.task_02;
/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Вывести нечетные элементы находящиеся под главной диагональю(включительно).
 */

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        System.out.println("Введите число, массив с какой длинной стороный Вы хотите");
        int number;
        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                number = input.nextInt();
            } else {
                System.out.println("Введены некорректные данные, попробуйте ввести число еще раз");
                continue;
            }
            if (number < 0) {
                System.out.println("Введити число, массив с какой длинной стороны Вы хотите. Оно должно быть положительным");
                continue;
            } else {
                input.close();
                break;
            }
        }
        int[][] array = new int[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 10) {
                    System.out.print(" ");  // чтобы матрицу не перекашивало при наличии в строках не одинакового числа однозначнх и двузначных чисел
                }
            }
            System.out.println("");
        }

        System.out.println("Список нечетных элементов под главной диоганалью включительно");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                    if (array[i][j] < 10) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(""); // маленькая модификация, чтобы элементы оставались в своих строках и на своих местах
        }                          // если необходимо просто вывести все необходимые элементы в одну строку, то нужно удалить строки 46-50 и 53
    }
}
