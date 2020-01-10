package homework.hw_12_collections.task_06;

/*
Есть ArrayList и LinkedList на 100К одинаковых элементов.
Нужно написать бенчмарк, который бы показал скорость удаления из НАЧАЛА у двух этих листов
Удалить нужно все элементы
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int SIZE_OF_LIST = 100_000;

    public static void main(String[] args) {

        List<Integer> arrayListExample = new ArrayList<>(SIZE_OF_LIST);
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            arrayListExample.add(i);
        }


        Long timeForArrayList = Task_06.removeTimeFromTheBeginning(arrayListExample);
        System.out.println("The time to delete this arrayList from its beginning is " + timeForArrayList);
        System.out.println(arrayListExample);

        List<Integer> linkedListExample = new LinkedList<Integer>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            linkedListExample.add(i);
        }

        Long timeForLinkedList = Task_06.removeTimeFromTheBeginning(linkedListExample);
        System.out.println("The time to delete this linkedList from its beginning is " + timeForLinkedList);
        System.out.println(linkedListExample);
    }


}
