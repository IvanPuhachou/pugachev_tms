package homework.hw_12_collections.task_11;

// Есть TreeSet имен, необходимо выбрать все от "H" до "W"

import java.util.SortedSet;
import java.util.TreeSet;

public class Task_11 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Ariana");
        names.add("Belinda");
        names.add("Emily");
        names.add("Howard");
        names.add("Nora");
        names.add("William");
        names.add("Xavier");

        SortedSet<String> sortedNames =  names.subSet("H", "X"); // Чтобы было до "W" включительно указал следующую за W букву алфавита
        System.out.println(sortedNames);
    }
}
