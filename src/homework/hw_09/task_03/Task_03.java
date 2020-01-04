package homework.hw_09.task_03;

/*
Есть массив слов. Нужно отфильтровать его так, чтобы в выходном массиве оказались слова, которые начинаются с буквы “A”
 */

import java.util.Arrays;

public class Task_03 {
    private static String startLetter = "A";
    private static String delimiter = " ";

    public static void main(String[] args) {
        String[] names = {"Iwan", "Alex", "Dima", "Anton", "Pasha", "Andrei", "Audi"};
        String selectedNames = getWords(names, startLetter, delimiter);
        String[] arraySelectedNames = selectedNames.split(delimiter);
        System.out.println(Arrays.toString(arraySelectedNames));
    }

    public static String getWords(String[] array, String startWitch, String delimiter) {
        String allWords = new String();
        for (String word : array) {
            if (word.startsWith(startWitch)) {
                allWords = String.join(delimiter, allWords, word);
            }
        }
        allWords = allWords.trim();
        return allWords;
    }
}
