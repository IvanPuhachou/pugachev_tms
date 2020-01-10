package homework.hw_12_collections.task_07;

import java.util.Comparator;

public class IntegerReversComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
