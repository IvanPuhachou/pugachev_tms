package homework.hw_14.task_05;

//Есть коллекция чисел, найти произведение первых 5ти элементов.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task_05 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList());

        Optional<Integer> productOfFirsFiveNumbers = integers.stream()
                .limit(5)
                .reduce((x, y) -> x * y);

        if (productOfFirsFiveNumbers.isPresent()) {
            System.out.println(productOfFirsFiveNumbers.get());
        } else {
            System.out.println("You don't have a result which describe product of first five numbers");
        }
    }
}
