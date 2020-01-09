package homework.hw_12_collections.task_03;

// Есть две коллекции, нужно удалить из первой те, которые есть во второй

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList = Task_03.fillArray(firstList, 5, 15);
        System.out.println(firstList);

        List<Integer> secondList = new ArrayList<>();
        secondList = Task_03.fillArray(secondList, 10, 20);
        System.out.println(secondList);


        firstList.removeAll(secondList);
        System.out.println(firstList);
    }
}
