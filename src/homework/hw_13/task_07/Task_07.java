package homework.hw_13.task_07;

//При помощи лямбда выражения, написать свой компаратор, который бы сортировал лист строк в обратном порядке

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task_07 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("William");
        names.add("Belinda");
        names.add("Eric");
        names.add("Xavier");
        names.add("Alex");
        names.add("Howard");
        names.add("Nora");
        names.add("Emily");
        names.add("Patrick");
        Comparator<String> descendingComparator = Comparator.reverseOrder();

    }
}
