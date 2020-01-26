package homework.hw_15.task_02;

//Есть текстовый файл. Нужно скопировать из него только те строки, которые содержат слово pancakes и записать их в другой фай

import java.io.*;

public class Task_02 {
    private static final String TEXT_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_15\\task_02\\TextFile";
    private static final String OUTPUT_FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_15\\task_02\\WriterFile";
    private static final String WORD = "pancakes";

    public static void main(String[] args) {

        Task_02.allStringsWithWord(TEXT_PATH, OUTPUT_FILE_PATH, WORD);
    }

    public static void allStringsWithWord(String text, String outputPath, String word) {
        try (FileReader fr = new FileReader(text);
             BufferedReader br = new BufferedReader(fr);
             FileWriter fw = new FileWriter(outputPath)
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    fw.write(line + "\n");
                }
                fw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
