package homework.hw_04.task_03;
/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Проверить произведение элементов какой диагонали больше.
 */
import java.util.Scanner;

public class Task_03 {
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
                array[i][j] = (int) (Math.random() * 51);
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 10) {
                    System.out.print(" ");  // чтобы матрицу не перекашивало при наличии в строках не одинакового числа однозначнх и двузначных чисел
                }
            }
            System.out.println("");
        }
        int firstProduct = array[0][0];
        int secondProduct = array[0][array.length - 1];

        for (int i = 1; i < array.length; i++) {
            firstProduct *= array[i][i];
        }

        for (int i = 1; i < array.length; i++) {
            secondProduct *= array[i][array.length - 1 - i];
        }

        if (firstProduct < secondProduct) {
            System.out.println("Произведение элементов главной диоганали  ( " + firstProduct + " ) меньше произведения элементов побочной диоганали ( " + secondProduct + " )");
        }
        if (firstProduct > secondProduct) {
            System.out.println("Произведение элементов главной диоганали  ( " + firstProduct + " ) больше произведения элементов побочной диоганали ( " + secondProduct + " )");
        }
        if (firstProduct == secondProduct) {
            System.out.println("Произведение элементов главной и побочной диоганалей равны между собой  ( " + firstProduct + " )");
        }
    }
}