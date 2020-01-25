package homework.hw_14.task_01;

//Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_01 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        collection.add("1");
        collection.add("12");
        collection.add("123");
        collection.add("1234");
        collection.add("12345");
        collection.add("123456");
        collection.add("1234567");
        collection.add("12345678");
        collection.add("123456789");

        List<String> lessThenFive = collection.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());

        System.out.println(lessThenFive);
    }
}
