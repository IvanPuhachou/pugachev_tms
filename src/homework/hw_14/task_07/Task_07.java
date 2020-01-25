package homework.hw_14.task_07;

//Есть коллекция телефонов. Найти телефон с наименьшей ценой

import homework.hw_14.task_03.Phone;

import java.util.ArrayList;
import java.util.List;

public class Task_07 {
    public static void main(String[] args) {
        
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Apple", 400));
        phones.add(new Phone("Nokia", 150));
        phones.add(new Phone("Huawei", 350));

        Phone theCheapestPhone = phones.stream()
                .min((x, y) -> x.getPrice() - y.getPrice())
                .get();

        System.out.println(theCheapestPhone);
    }
}
