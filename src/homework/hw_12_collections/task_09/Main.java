package homework.hw_12_collections.task_09;

// Есть TreeSet<Student>. Заполните его списком студентов. Если получили исключение, вспомните про интерфейс Comparable или Comparator

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Ivan", "Petrov"));
        students.add(new Student("Sasha", "Petrov"));
        students.add(new Student("Petja", "Ivanov"));
        System.out.println(students);

    }

}
