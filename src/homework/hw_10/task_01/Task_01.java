package homework.hw_10.task_01;

import java.util.Scanner;

/*
Создать метод, который бы делил одно число на другое, обработать исключение при делении на 0.
 */

public class Task_01 {
    public static void main(String[] args) {
        double firstNumber = 0;
        double secondNumber = 0;
        System.out.println("Please, enter the first number");

        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                firstNumber = input.nextDouble();
                break;
            } else
                System.out.println("You didn't enter number. Try again");
        }

        System.out.println("Please, enter the second number");

        while (true) {
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                secondNumber = input.nextDouble();
                break;
            } else
                System.out.println("You didn't enter number. Try again");
        }

        double result = division(firstNumber, secondNumber);
        System.out.println(result);
        System.out.println(7.0 / 0.0);
    }


    public static Double division(Double x, Double y) {
        Scanner input = new Scanner(System.in);
        double result;
        for (; ; ) {

            try {
                result = x / y;    // при делении на наль у даблов ошибки не возникает, а получается infinity
                if (y == 0) {
                    throw (new ArithmeticException());
                }
                break;
            } catch (ArithmeticException e) {
                System.out.println("The second number cannot be zero. Please enter new number");
                y = input.nextDouble();
            }
        }
        input.close();
        return result;
    }
}

