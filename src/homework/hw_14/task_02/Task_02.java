package homework.hw_14.task_02;

//Есть коллекция строк, нужно найти строку с максимальной длинной.

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task_02 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("1");
        strings.add("12");
        strings.add("123");
        strings.add("1234");
        strings.add("12345");
        strings.add("123456");
        strings.add("1234567");
        strings.add("12345678");
        strings.add("123456789");

        Optional<String> max = strings.stream()
                .max((a1, a2) -> a1.length() - a2.length());

        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("You don't have strings");
        }

    }
}
