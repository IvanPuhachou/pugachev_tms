package homework.hw_11.task_05;

/*
Task_ 04 - Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
У Employee есть имя, возраст и работа. Используйте конструкторы. Запишите объект Employee в файл,
 затем восстановите его обратно в объект.
 Продолжение Task_4. А теперь поменяйте любое приватное поле Work/Employee на паблик. Создайте новый класс для метода мейн
и попробуйте прочитать файл, который вы туда записали. Попробуйте найти решение в интернете  // todo не возникло проблем
 */

import java.io.*;

public class Task_05 implements Serializable {
    private static final long serialVersionUID = 33L;
    private static final String FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_11\\task_05\\SaveEmployee";

    public static void main(String[] args) {
        try (FileOutputStream fo = new FileOutputStream(FILE_PATH);
             ObjectOutputStream obo = new ObjectOutputStream(fo)) {

            Employee bob = new Employee("Bob", 34, new Work("chemist", 9));
            obo.writeObject(bob);
            obo.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileInputStream fs = new FileInputStream(FILE_PATH);
             ObjectInputStream obs = new ObjectInputStream(fs)) {

            Employee employee = (Employee) obs.readObject();
            System.out.println(employee);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
