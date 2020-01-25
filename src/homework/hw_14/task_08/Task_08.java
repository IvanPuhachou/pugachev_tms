package homework.hw_14.task_08;

//Есть коллекция телефонов, нужно сгруппировать по компании и вывести на экран

import homework.hw_14.task_03.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_08 {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Xiaomi", 250));
        phones.add(new Phone("Apple", 500));
        phones.add(new Phone("Apple", 600));

        Map<String, List<Phone>> collect = phones.stream()
                .collect(Collectors.groupingBy(Phone::getProducer));

        System.out.println(collect);

    }
}
