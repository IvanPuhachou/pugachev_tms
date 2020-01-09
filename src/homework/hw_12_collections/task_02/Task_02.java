package homework.hw_12_collections.task_02;

/*
Создайте целочисленный ArrayList. Заполните его 100 элементами, добавляя каждый новый элемент в начало списка и выведите на экран.
Затем удалите из него все четные элементы. И снова выведите на экран
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_02 {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(100);
        List<Integer> secondList = new ArrayList<>(100);

        firstList = Task_02.randomFillArray(firstList, 10, 20, 100);
        System.out.println(firstList);
        System.out.println(Task_02.removeOdd(firstList));

        secondList = Task_02.randomFillArray(secondList, 0, 40, 100);
        System.out.println(secondList);
        System.out.println(Task_02.removeOddNumber(secondList));
    }


    public static List randomFillArray(List<Integer> list, int minValue, int maxValue, int lastIndex) {
        for (int i = 0; i < lastIndex; i++) {
            list.add((int) (Math.random() * (maxValue + 1 - minValue)) + minValue);
        }
        return list;
    }


    public static List removeOdd(List<Integer> witchOdd) {    // удаление четных по значению
        Iterator<Integer> iterator = witchOdd.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return witchOdd;
    }


    public static List removeOddNumber(List<Integer> witchOdd) {   // удаление четных по порядку
        Iterator<Integer> iterator = witchOdd.iterator();
        int counter = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (counter % 2 != 0) {
                iterator.remove();
            }
            counter++;
        }
        return witchOdd;
    }
}
