package homework.hw_11.task_04;

/*
Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
У Employee есть имя, возраст и работа. Используйте конструкторы. Запишите объект Employee в файл,
 затем восстановите его обратно в объект.
 */

import java.io.*;

public class Task_04 implements Serializable {
    private static final long serialVersionUID = 33L;
    private static final String FILE_PATH = "C:\\Users\\Иван Пугачёв\\IdeaProjects\\pugahcev_tms\\src\\homework\\hw_11\\task_04\\SaveEmployee";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Employee jon = new Employee("Jon", 27, new Work("teacher", 5));
            oos.writeObject(jon);
            oos.flush();

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
