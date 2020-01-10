package homework.hw_12_collections.task_10;

import java.util.HashMap;
import java.util.List;

public class Fruit {
    private KindOfFruits sort;
    private int weight;

    public Fruit(KindOfFruits sort, int weight) {
        this.sort = sort;
        this.weight = weight;
    }          // не добавлял Геттеры и Сеттеры и тд., чтобы не захламлять лишними строками - для решения этой задачи они не нужны


    public static HashMap<KindOfFruits, Integer> fruitInventory(List<Fruit> fruits) {
        HashMap<KindOfFruits, Integer> fruitHashMap = new HashMap<>();
        for (Fruit fruit : fruits) {
            int weight = fruit.weight;
            int sumWeight;
            if (fruitHashMap.get(fruit.sort) == null) {
                sumWeight = weight;
            } else {
                sumWeight = weight + fruitHashMap.get(fruit.sort);
            }
            fruitHashMap.put(fruit.sort, sumWeight);
        }
        return fruitHashMap;
    }
}

enum KindOfFruits {
    BANANA,
    ORANGE,
    APPLE,
    GRAPEFRUIT
}
