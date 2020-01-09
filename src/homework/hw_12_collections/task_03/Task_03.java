package homework.hw_12_collections.task_03;

// Есть две коллекции, нужно удалить из первой те, которые есть во второй

import homework.hw_12_collections.task_02.Task_02;

import java.util.ArrayList;
import java.util.List;

public class Task_03 {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList = Task_02.randomFillArray(firstList, 0, 10, 10); // метод заполнения листа из предыдущего задания
        System.out.println(firstList);

        List<Integer> secondList = new ArrayList<>();
        secondList = Task_02.randomFillArray(secondList, 0, 5, 5);
        System.out.println(secondList);


        firstList.removeAll(secondList);
        System.out.println(firstList);
    }
}
