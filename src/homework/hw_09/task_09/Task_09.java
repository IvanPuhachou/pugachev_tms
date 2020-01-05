package homework.hw_09.task_09;

/*
Есть массив строк, вывести на экран все строки, длина которых больше 5 символов
 */

public class Task_09 {
    public static void main(String[] args) {
        String[] stringsArray = {"a", "useful", "Alex", "correctly", "abroad", "seem", "mistake"};
        for (String word : stringsArray) {
            if (word.length() > 5) {
                System.out.println(word);
            }
        }

    }
}
