package homework.hw_15.task_05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
создать лист элементов (типа cat) заполнить лист элементами и null,
сериализовать лист в файл и десериализовать из файла. проверить наличие null элементов
 */

public class Main {
    private static final String TEXT_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_15\\task_05\\File";

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik"));
        cats.add(null);
        cats.add(new Cat("Tom"));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TEXT_PATH))) {
                oos.writeObject(cats);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        List<Cat> catsFromFile = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TEXT_PATH)))
        {
            catsFromFile=((ArrayList<Cat>)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(catsFromFile);

    }
}
