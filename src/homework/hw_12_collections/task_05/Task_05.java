package homework.hw_12_collections.task_05;

import java.util.List;

public class Task_05 {

    public static <T> Long removeTimeFromTheMiddle(List<T> list) {
        long startTime = System.currentTimeMillis();

        while (list.size() > 0) {
            list.remove(list.size() / 2);
        }
        long finishTime = System.currentTimeMillis();
        long allTime = finishTime - startTime;
        return allTime;
    }
}
