package homework.hw_12_collections.task_05;

/*
Есть ArrayList и LinkedList на 100К одинаковых элементов.
Нужно написать бенчмарк, который бы показал скорость удаления из СЕРЕДИНЫ у двух этих листов
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


        Long timeForArrayList = Task_05.removeTimeFromTheMiddle(arrayListExample);
        System.out.println("The time to delete this arrayList from its middle is " + timeForArrayList);
        System.out.println(arrayListExample);

        List<Integer> linkedListExample = new LinkedList<Integer>();
        for (int i = 0; i < SIZE_OF_LIST; i++) {
            linkedListExample.add(i);
        }

        Long timeForLinkedList = Task_05.removeTimeFromTheMiddle(linkedListExample);
        System.out.println("The time to delete this linkedList from its middle is " + timeForLinkedList);
        System.out.println(linkedListExample);
    }


}
