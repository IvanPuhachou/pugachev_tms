package homework.hw_12_collections.task_03;


import java.util.List;

public class Task_03 {

    public static List fillArray(List<Integer> list, int firstIndex, int lastIndex) {   // ошибку где последний индекс меньше первого не обрабатывал, поскольку не это суть задания
        for (int i = firstIndex; i <= lastIndex; i++) {
            list.add(i);
        }
        return list;
    }
}
