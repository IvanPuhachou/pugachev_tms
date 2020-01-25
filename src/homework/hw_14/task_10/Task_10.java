package homework.hw_14.task_10;

/*
Есть коллекция телефонов, сделать из нее мапу, в которой ключ - это производитель, а вэлью - это кол-во телефонов
этого производителя в исходной коллекции
 */

import homework.hw_14.task_03.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_10 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Xiaomi", 250));
        phones.add(new Phone("Xiaomi", 300));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Apple", 400));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Nokia", 150));
        phones.add(new Phone("Nokia", 100));
        phones.add(new Phone("Nokia", 550));

        Map<String, Long> countingByProducer= phones.stream()
                .collect(Collectors.groupingBy(Phone::getProducer, Collectors.counting()));

        System.out.println(countingByProducer);
    }
}
