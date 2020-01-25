package homework.hw_14.task_06;

import homework.hw_14.task_03.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task_06 {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Xiaomi", 250));
        phones.add(new Phone("Xiaomi", 250));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Apple", 400));
        phones.add(new Phone("Apple", 450));
        phones.add(new Phone("Apple", 500));

        List<Phone> collect = phones.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
