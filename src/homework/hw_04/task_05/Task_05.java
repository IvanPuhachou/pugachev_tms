package homework.hw_04.task_05;
/*
Создаём квадратную матрицу, размер вводим с клавиатуры.
Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
Транспонировать матрицу (1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т.д.)
 */
import java.util.Scanner;

public class Task_05 {
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
        int[][] array = new int[number][number]; // поскольку в условиях задачи массив в виде квадрата
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 51);
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 10) {
                    System.out.print(" "); // чтобы матрицу не перекашивало при наличии в строках не одинакового числа однозначнх и двузначных чисел
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {  // j < i данное условие для того, чтобы не пройтись по всей матрице и не транспонировать ее дважды
                int b = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = b;
            }
        }
        System.out.println("Транспонированная матрица имеет следующий вид");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] < 10) {
                    System.out.print(" "); // чтобы матрицу не перекашивало при наличии в строках не одинакового числа однозначнх и двузначных чисел
                }
            }
            System.out.println("");

        }
    }
}