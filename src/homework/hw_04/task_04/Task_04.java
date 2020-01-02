package homework.hw_04.task_04;
/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Посчитать сумму четных элементов стоящих над побочной диагональю (не включительно)
 */
import java.util.Scanner;

public class Task_04 {
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
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = (array.length - i - 2); j >= 0; j--) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(" Сумма четных элементов над побочной диагональю равна " + sum);
    }
}