package homework.hw_12_collections.task_10;

/*
Есть неупорядоченный склад с фруктами (допустим это List<Fruits>). У фрукта есть название и кол-во в кг.
Нужно произвести переучет и выяснить общее кол-во килограмм каждого из фруктов.
Попробуйте в качестве учетного журнала использовать HashMap или TreeMap
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(new Fruit(KindOfFruits.BANANA, 15));
        fruits.add(new Fruit(KindOfFruits.BANANA, 15));
        fruits.add(new Fruit(KindOfFruits.GRAPEFRUIT, 10));
        fruits.add(new Fruit(KindOfFruits.GRAPEFRUIT, 5));
        fruits.add(new Fruit(KindOfFruits.APPLE, 20));
        fruits.add(new Fruit(KindOfFruits.APPLE, 15));
        fruits.add(new Fruit(KindOfFruits.ORANGE, 10));
        fruits.add(new Fruit(KindOfFruits.BANANA, 15));

        HashMap<KindOfFruits, Integer> sumFruits = Fruit.fruitInventory(fruits);

        for (Map.Entry entry : sumFruits.entrySet()) {
            System.out.println(entry);
        }
    }
}
