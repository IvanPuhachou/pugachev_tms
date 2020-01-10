package homework.hw_12_collections.task_06;

import java.util.List;


public class Task_06 {

    public static <T> Long removeTimeFromTheBeginning(List<T> list) {
        long startTime = System.currentTimeMillis();
        while (list.size() > 0) {
            list.remove(0);
        }
        long finishTime = System.currentTimeMillis();
        long allTime = finishTime - startTime;
        return allTime;
    }
}
