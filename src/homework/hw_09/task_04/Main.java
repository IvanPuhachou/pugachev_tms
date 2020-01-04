package homework.hw_09.task_04;

/*
Есть слово “alucard”. Нужно изменить порядок букв на обратный.
 */

public class Main {
    public static void main(String[] args) {
        String word = "alucard";

        System.out.println(WordFlip.wordFlip(word));
        System.out.println(WordFlip.wordFlipWithRecursion(word));
    }
}
