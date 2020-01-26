package homework.hw_15.task_03;

//Есть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_03 {
    public static void main(String[] args) {


        List<Integer> firstIntList = new ArrayList<>();
        firstIntList.add(1);
        firstIntList.add(2);
        firstIntList.add(3);

        List<Integer> secondIntList = new ArrayList<>();
        secondIntList.add(4);
        secondIntList.add(5);
        secondIntList.add(6);

        List<Integer> thirdIntList = new ArrayList<>();
        thirdIntList.add(7);
        thirdIntList.add(8);
        thirdIntList.add(9);

        Map<String, List<Integer>> firstMap = new HashMap<>();
        firstMap.put("First", firstIntList);
        firstMap.put("Second", secondIntList);
        firstMap.put("Third", secondIntList);

        Map<String, List<Integer>> secondMap = new HashMap<>();
        secondMap.put("Third", thirdIntList);

        Map<String, List<Integer>> collectors = Stream.of(firstMap, secondMap)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> {
                            List<Integer> merged = new ArrayList<>(v1);
                            merged.addAll(v2);
                            return merged; }));    // при совпадении ключей данному ключу будет присвоен лист собранный из двух листов с одинаковым ключом


        for (Map.Entry<String, List<Integer>> item : collectors.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}

