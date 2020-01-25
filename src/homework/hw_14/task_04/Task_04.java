package homework.hw_14.task_04;

//Есть коллекция чисел, найти первое, которое будет больше 22.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_04 {
    public static final Integer limit = 22;

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(12, 22, 32, 4, 15, 24, 47));

        Optional<Integer> firstMoreAsLimit = integers.stream()
                .filter(number -> number > limit)
                .findFirst();

        if (firstMoreAsLimit.isPresent()) {
            System.out.println(firstMoreAsLimit.get());
        } else {
            System.out.println("You don't have a number which is more as " + limit);
        }
    }
}
