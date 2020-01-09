package homework.hw_12_collections.task_04;

//  Есть две коллекции, нужно оставить в первой только те, которые есть во второй

import homework.hw_12_collections.task_03.Task_03;

import java.util.ArrayList;
import java.util.List;

public class Task_04 {

    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList = Task_03.fillArray(firstList, 5, 15);  // метод из предыдущего занятия
        System.out.println(firstList);

        List<Integer> secondList = new ArrayList<>();
        secondList = Task_03.fillArray(secondList, 10, 20);
        System.out.println(secondList);

        firstList.retainAll(secondList);
        System.out.println(firstList);

    }
}
