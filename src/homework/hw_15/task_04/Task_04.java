package homework.hw_15.task_04;
/*
Написать StringUtils класс который умеет искать в тексте слова-полиндромы.
Результат работы программы - вывод на консоль всех полиндромов из текста.
Учесть что в тексте могут быть запятые,точки, вопросительные и восклицательные знаки.
Пример строка: камень, бакаб и пороороп! На экран должен быть вывод двух последних слов
 */

public class Task_04 {
    private static final String TEXT = " камень, бакаб и пороороп!";

    public static void main(String[] args) {

        System.out.println(Task_04.findPalindromes(TEXT));
    }

    public static String findPalindromes(String text) {
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        String allPalindromes = "";
        for (String word : words) {
            StringBuilder normal = new StringBuilder(word);
            StringBuilder reverse = new StringBuilder(word).reverse();
            if (normal.toString().equals(reverse.toString())) {
                allPalindromes = allPalindromes + word + " ";
            }
        }
        if (allPalindromes.equals("")) {
            allPalindromes = "Your text doesn't have palindromes";
        }
        return allPalindromes;
    }
}

