package homework.hw_13.task_05;
/*
Создать метод, который бы принимал на вход List<User> и предикат, по которому все юзеры,
у которых имена начинаются с A,P,E удалялись бы из этого листа
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> startWithA = (name) -> name.startsWith("A");
        Predicate<String> startWithE = (name) -> name.startsWith("E");
        Predicate<String> startWithP = (name) -> name.startsWith("P");

        List<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Belinda");
        names.add("Emily");
        names.add("Eric");
        names.add("Howard");
        names.add("Nora");
        names.add("Patrick");
        names.add("William");
        names.add("Xavier");

        System.out.println(names);

        RemoveStringWithPredicate.removeStringFromCollection(names, startWithA.or(startWithE.or(startWithP)));

        System.out.println(names);

    }
}
