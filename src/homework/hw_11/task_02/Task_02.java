package homework.hw_11.task_02;

/*
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже предложение, запишите его 1млн раз
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task_02 {
    private static final String TEXT = "This is nonsensical text";
    private static final String FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_11\\task_02\\WriterFile";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i = 0; i < 1_000_000; i++) {
                bw.write(i + " " + TEXT + "\n");
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
