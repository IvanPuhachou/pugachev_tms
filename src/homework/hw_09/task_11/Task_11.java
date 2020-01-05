package homework.hw_09.task_11;

/*
Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */

import java.util.Scanner;

public class Task_11 {
    private static int n = 5;

    public static void main(String[] args) {
        String[] stringsArray = new String[n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {       // абсолютно никаких наложений на вводимую строку
            System.out.println("Please enter a string number " + (i + 1) + ". Total number of strings is " + n);
            stringsArray[i] = input.next();
        }
        input.close();

        String shortString = new String(stringsArray[0]);
        String longString = new String(stringsArray[0]);
        for (int i = 1; i < stringsArray.length; i++) {
            if (stringsArray[i].length() > longString.length()) {
                longString = stringsArray[i];
            }
            if (stringsArray[i].length() < shortString.length()) {
                shortString = stringsArray[i];
            }
        }
        System.out.println("The shortest string is \"" + shortString + "\". The length of this string is " + shortString.length());
        System.out.println("The longest string is \"" + longString+ "\". The length of this string is " +  longString.length());
    }
}
