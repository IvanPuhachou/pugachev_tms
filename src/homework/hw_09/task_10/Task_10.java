package homework.hw_09.task_10;

/*
Ввести 2 слова при помощи Scanner, состоящие из четного числа букв.
 Получить слово состоящее из первой половины первого слова и второй половины второго
 */

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first word");
        String firstWord = input.next();
        for (; ; ) {                           // какой бы билебердой не было слово главное, чтобы в нем было четное число символов
            if (firstWord.length() % 2 == 1) {
                System.out.println("Your word must contain an even number of letters");
                System.out.println("Please enter the word");
                firstWord = input.next();
            } else if (firstWord.length() % 2 == 0) {
                break;
            }
        }
        System.out.println("Please enter the second word");
        String secondWord = input.next();
        for (; ; ) {
            if (secondWord.length() % 2 == 1) {
                System.out.println("Your word must contain an even number of letters");
                System.out.println("Please enter the word");
                secondWord = input.next();
            } else if (secondWord.length() % 2 == 0) {
                break;
            }
        }
        input.close();

        String finalFirst = firstWord.substring(0, firstWord.length() / 2);
        String finalSecond = secondWord.substring(secondWord.length() / 2);
        System.out.println(finalFirst + finalSecond);
    }
}
