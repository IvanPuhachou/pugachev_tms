package homework.hw_11.task_01;
/*
Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Task_01 {
    private static final String FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_11\\task_01\\WriterFile";

    public static void main(String[] args) {
        int[] numbersArray = new int[20];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = (int) (Math.random() * 41);
        }
        try ( FileWriter fw = new FileWriter(FILE_PATH);
              BufferedWriter bw = new BufferedWriter(fw)) {
            fw.write(Arrays.toString(numbersArray));
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(numbersArray));
    }
}