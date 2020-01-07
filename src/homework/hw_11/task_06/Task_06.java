package homework.hw_11.task_06;

/*
Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_06 {
    private static final String FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_11\\task_06\\Foto.png";

    public static void main(String[] args) {


        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {

            String message = "I'm Thomas Shelby";
            fos.write(message.getBytes());
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            int i;
            int counter = 0;
            while ((i = fis.read()) != -1) {
                System.out.print(counter + " ");
                System.out.println((char) i);
                counter++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
