package homework.hw_12_collections.task_02;

import java.util.Iterator;
import java.util.List;

public class Task_02 {

    public static List randomFillArray(List<Integer> list, int minValue, int maxValue, int lastIndex) {
        for (int i = 0; i < lastIndex; i++) {
            if (maxValue >= 0) {
                list.add((int) (Math.random() * (maxValue + 1 - minValue)) + minValue);
            } else if (maxValue < 0) {
                list.add((int) (Math.random() * (maxValue - 1 - minValue)) + minValue);
            }
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
