package homework.hw_09.task_12;

/*
Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task_12 {
    private static int n = 5;

    public static void main(String[] args) {
        String[] stringsArray = new String[n];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter a string number " + (i + 1) + ". Total number of strings is " + n);
            stringsArray[i] = input.next();
        }
        System.out.println(Arrays.toString(stringsArray));
        String word = new String();
        for (int i = stringsArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (stringsArray[j].length() > stringsArray[j + 1].length()) { // для убываения надо только заменить знак ">" на "<"
                    word = stringsArray[j + 1];
                    stringsArray[j + 1] = stringsArray[j];
                    stringsArray[j] = word;
                }

            }
        }
        System.out.println(Arrays.toString(stringsArray));
    }
}
