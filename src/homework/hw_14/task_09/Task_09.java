package homework.hw_14.task_09;

//Есть коллекция телефонов. Нужно разделить на две части, в одной только айфоны, в другой остальные производители.

import homework.hw_14.task_03.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_09 {
    private static final String APPLE = "Apple";
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Apple", 450));
        phones.add(new Phone("Samsung", 350));
        phones.add(new Phone("Apple", 500));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Apple", 400));

        Map<Boolean, List<Phone>> collectByAppleOrNot = phones.stream()
                .collect(Collectors.groupingBy(phone -> APPLE.equals(phone.getProducer())));

        System.out.println(collectByAppleOrNot);
    }
}
