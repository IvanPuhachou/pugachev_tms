package homework.hw_10.task_04;

import java.util.Scanner;

/*
Создать собственное исключение UnderAttackException. В методе мейн попросить пользователя
 ввести число и если оно нечетное, то выбросить созданное исключение.
 */

public class Task_04 {
    public static void main(String[] args) throws UnderAttackException {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a even number");
        number = scanner.nextInt();                      // опять же вариант ошибки с введением не числа как таковго не разбирал
        if (number % 2 == 1 || number % 2 == -1) {
            throw new UnderAttackException("This number is uneven");
        }
        System.out.println("Your number is " + number);
    }

}
