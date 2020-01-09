package homework.hw_12_collections.task_02;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(100);
        List<Integer> secondList = new ArrayList<>(100);

        firstList = Task_02.randomFillArray(firstList, 10, 20, 20);
        System.out.println(firstList);
        System.out.println(Task_02.removeOdd(firstList));          // удаление четных по значению

        secondList = Task_02.randomFillArray(secondList, 0, 40, 20);
        System.out.println(secondList);
        System.out.println(Task_02.removeOddNumber(secondList));    // удаление четных по порядку
    }
}
