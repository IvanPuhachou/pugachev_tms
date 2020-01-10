package homework.hw_12_collections.task_07;

// Есть TreeSet чисел, нужно отсортировать его в обратном порядке

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        IntegerReversComparator comparator = new IntegerReversComparator();
        TreeSet<Integer> integers = new TreeSet<>(comparator);
        integers.add(5);
        integers.add(7);
        integers.add(13);
        integers.add(4);
        integers.add(10);
        System.out.println(integers);
    }
}
