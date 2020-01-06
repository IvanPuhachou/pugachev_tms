package homework.hw_10.task_02;

/*
Написать метод, который бы парсил строку в число, но само исключение неверного формата числа не обрабатывал, а пробрасывал его выше.
В методе мейн вы должны обработать это исключение.
 */

import java.util.Scanner;

public class Task_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        String numberText = input.next();
        input.close();

        int result = 0;
        try {
            result = parserFromIvan(numberText);
        } catch (NumberFormatException e) {
            System.out.println("The entered line is incorrectly. This wasn't a number");
        }

        System.out.println(result);
    }

    public static Integer parserFromIvan(String a) throws NumberFormatException {
        int result = Integer.parseInt(a);
        return result;
    }
}
