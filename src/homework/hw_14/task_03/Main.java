package homework.hw_14.task_03;

/*Есть коллекция телефонов. Необходимо получить из нее коллекцию производителей (производитель - это строка) и оставить только те,
которые входят в список:  Apple, Samsung, Xiaomi
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    private static final String APPLE = "Apple";
    private static final String SAMSUNG = "Samsung";
    private static final String XIAOMI = "Xiaomi";

    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xiaomi", 200));
        phones.add(new Phone("Samsung", 300));
        phones.add(new Phone("Apple", 400));
        phones.add(new Phone("Nokia", 250));
        phones.add(new Phone("Huawei", 350));

        Predicate<String> filteredByProducer = producer -> APPLE.equals(producer) || SAMSUNG.equals(producer) || XIAOMI.equals(producer);

        List<String> filteredListOfProducer = phones.stream()
                .map(phone -> phone.getProducer())
                .filter(filteredByProducer)
                .collect(Collectors.toList());

        System.out.println(filteredListOfProducer);

    }
}
