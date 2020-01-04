package homework.hw_09.task_04;

public class WordFlip {

    public static String wordFlip(String word) {   // простой способ последовательного прикрепления символов из слова
        String reverseWord = new String();
        for (int i = 0; i < word.length(); i++) {
            reverseWord = word.charAt(i) + reverseWord;
        }
        return reverseWord;
    }

    public static String wordFlipWithRecursion(String word) {     // рекурсия с делением слова пополам и переставлением половин местами
        String rightPart;
        String leftPart;

        int length = word.length();
        if (length <= 1) {
            return word;
        }
        leftPart = word.substring(0, length / 2);
        rightPart = word.substring(length / 2, length);

        return wordFlipWithRecursion(rightPart) + wordFlipWithRecursion(leftPart);
    }
}

